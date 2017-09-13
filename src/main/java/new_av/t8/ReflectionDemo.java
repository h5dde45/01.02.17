package new_av.t8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> multiSetClass = Class.forName("new_av.t8.MultiSetImpl");

        boolean implMultSet = MultiSet.class.isAssignableFrom(multiSetClass);
        System.out.println(implMultSet);

        Constructor<?> defaultConstructor =null;// multiSetClass.getConstructor();
        Constructor<?> collectionConstructor =null;// multiSetClass.getConstructor(Collection.class);

        for(Constructor<?> constructor:multiSetClass.getConstructors()){
            Class<?>[] parameterTypes=constructor.getParameterTypes();
            if(parameterTypes.length==0){
                defaultConstructor=constructor;
            }else if (parameterTypes.length==1&&parameterTypes[0].equals(Collection.class)){
                collectionConstructor=constructor;
            }
        }
        System.out.println(defaultConstructor != null);
        System.out.println(collectionConstructor != null);

        Class<?> superClass = multiSetClass.getSuperclass();
        if (!Object.class.equals(superClass)) {
            System.out.println(superClass.getCanonicalName());
        }

        Class<?> cuurrClass = multiSetClass;
        do {
            for (Field field : cuurrClass.getDeclaredFields()) {
                if ((field.getModifiers() & Modifier.STATIC) == 0) {
                    System.out.print(field.getType().getCanonicalName() + " " +
                            field.getName() + " " + cuurrClass.getCanonicalName()+"\n"
                    );
                }

            }
            cuurrClass = cuurrClass.getSuperclass();
        } while (!Object.class.equals(cuurrClass));
        MultiSet multiSetInstance = (MultiSet) defaultConstructor.newInstance();
    }
}
