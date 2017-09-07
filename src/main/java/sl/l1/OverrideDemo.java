package sl.l1;

import java.io.IOException;

public class OverrideDemo extends SuperClass {


    /**
     * public and protected - ok,
     * default (package-private) and private - not good
     */
    @Override
    protected void drive() {
    }

    /**
     * IOException - narrowing ok,
     * Throwable - extension not good
     */
    @Override
    public void swim() throws IOException {}

    /**
     *
     * delete Exception - ok
     */
    @Override
    public void swim2() {}

    /**
     * add Exception is not good
     */
    @Override
    public void swim3()
//    throws Exception
    {
        super.swim3();
    }

    /**
     *
     * changes return value wrong
     */
    @Override
    String
//  Integer
    getStr() {
        return "new text";
//        return new Integer(2);
    }

    /**
     *
     * change the return value to a subclass it correctly
     */
    @Override
    Double getNum() {
        return 1.;
    }

    /**
     *  hide method
     */
    public void go() {
    }

    /**
     * to override a static method cannot
     */
    static void stat() {
        System.out.println("2331");
    }

}

class SuperClass {
    protected void drive() {
    }

    public void swim() throws Exception {
    }

    public void swim2() throws IOException {
    }

    public void swim3() {
    }

    String getStr() {
        return "";
    }

    Number getNum() {
        return 1;
    }

    private void go() {
    }

    static void stat() {
        System.out.println("1");
    }
}
