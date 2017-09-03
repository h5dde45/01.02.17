package va.t8.p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Person person=new Person(1,"1");
        Class c1=person.getClass();
        System.out.println(c1);

        Class c2=String[].class;
        Class c6=String.class;
        Class c3=int[].class;
        Class c5=char[].class;

        Class c4=Class.forName("java.lang.Long");
        System.out.println(c2);
        System.out.println(c2.getCanonicalName());
        System.out.println(c2.getSimpleName());
        System.out.println(c2.getName());
        System.out.println(c3);
        System.out.println(c3.getCanonicalName());
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c1.isArray());
        System.out.println(c2.isArray());
        System.out.println(c2.getComponentType());
        System.out.println(c2.getComponentType().isMemberClass());
        System.out.println(c2.getComponentType().isLocalClass());
        System.out.println("****************");

        System.out.println(c1.getConstructor());
        System.out.println(c1.getConstructor(int.class,String.class));
        System.out.println(c1.getDeclaredConstructor(int.class));
        System.out.println(Arrays.toString(c1.getConstructors()));
        System.out.println(Arrays.toString(c1.getDeclaredConstructors()));

        Constructor constructor=c1.getConstructor(int.class,String.class);
        Object instance=constructor.newInstance(2,"2");
        System.out.println(instance);
        System.out.println(c1.getMethod("getId"));
        System.out.println(c1.getMethod("setId",int.class));
        System.out.println(Arrays.toString(c1.getMethods()));
        System.out.println(c1.getDeclaredMethod("getId"));
        System.out.println(Arrays.toString(c1.getDeclaredMethods()));
        System.out.println("******************");
        System.out.println(c1.getField("fname"));
        System.out.println(Arrays.toString(c1.getFields()));
        System.out.println(c1.getDeclaredField("name"));
        System.out.println(Arrays.toString(c1.getDeclaredFields()));


    }
}
