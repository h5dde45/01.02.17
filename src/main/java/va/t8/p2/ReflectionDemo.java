package va.t8.p2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Objects;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> multiSetClass = Class.forName("va.t8.p2.MultiSetImpl");

        boolean imlementMultiSet = MultiSet.class.isAssignableFrom(multiSetClass);
        System.out.println(imlementMultiSet);

        Constructor<?> defaultConstructor = null;
        Constructor<?> collectionConstructor = null;

        for (Constructor<?> constructor : multiSetClass.getConstructors()) {
            Class<?>[] parametrTypes = constructor.getParameterTypes();
            if (parametrTypes.length == 0) {
                defaultConstructor = constructor;
            } else if (parametrTypes.length == 1 && parametrTypes[0].equals(Collection.class)) {
                collectionConstructor = constructor;
            }
        }
        System.out.println("default = " + (defaultConstructor != null));
        System.out.println("collection = " + (collectionConstructor != null));

        Class<?> superClass = multiSetClass.getSuperclass();
        if (!Objects.class.equals(superClass)) {
            System.out.println("extends " + superClass.getCanonicalName());
        }

        System.out.println("Fields:");
        Class<?> currentClass = multiSetClass;
        do {
            for (Field field : currentClass.getDeclaredFields()) {
                if ((field.getModifiers() & Modifier.STATIC) == 0) {
                    System.out.println(
                            "- " + field.getType().getCanonicalName() + " " + field.getName() +
                                    " (in " + currentClass.getCanonicalName() + ") "
                    );
                }
            }
            currentClass = currentClass.getSuperclass();
        } while (!Object.class.equals(currentClass));

        MultiSet multiSetInstance = (MultiSet) defaultConstructor.newInstance();
    }
}
