package sl.t25;

import java.lang.reflect.Field;

public class ReflClass {
    public static void main(String[] args) {

        final Class<?> cls=TestClass.class;

        TestClass testClass = new TestClass();
        try {
            Field field=cls.getDeclaredField("i_priv");
            field.setAccessible(true);
            System.out.println(field.getInt(testClass));
            field.setInt(testClass,45);
            System.out.println(field.getInt(testClass));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
