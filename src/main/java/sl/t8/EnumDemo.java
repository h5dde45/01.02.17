package sl.t8;

enum Dog1 {
    DOG1(23),
    DOG2(56),
    DOG3(73),
    DOG4,
    DOG5(13);

    private int weigth;

    Dog1(int weigth) {
        this.weigth = weigth;
    }

    Dog1() {
        weigth = 99;
    }

    public int getWeight() {
        return weigth;
    }
}

public class EnumDemo {
    public static void main(String[] args) {

        Dog1 dog1;
        System.out.println(Dog1.DOG2.getWeight());

        for(Dog1 dog11:Dog1.values()){
            System.out.println(dog11+", "+dog11.getWeight());
        }


    }
}
