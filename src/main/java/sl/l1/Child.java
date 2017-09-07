package sl.l1;

class Parent {
    protected void test(){
        System.out.println("from parent");
    }
    protected void test2(){
        System.out.println("from parent test2");
    }
}
public class Child extends Parent {
    public static void main(String[] args) {
        Child child=new Child();
        child.test();

        Parent parent=new Parent();
        parent.test();

        parent=child;
        parent.test();

        child.testSup();
    }

    @Override
     protected void test() {
        System.out.println("from child");
    }
    private void testSup(){
        super.test();
    }
}
