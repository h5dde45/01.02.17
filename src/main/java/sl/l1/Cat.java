package sl.l1;

class Animal {
    void doAnimal_1() {
    }
}

public class Cat extends Animal {
    void doCat_1() {}

    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.doCat_1();
        cat.doAnimal_1();

        Animal animal=new Cat();//upcast
        animal.doAnimal_1();
//        animal.doCat_1();
        cat= (Cat) animal;// downcast
        cat.doCat_1();

        int i=123;
        byte b= (byte) i;// downcast

    }
}
