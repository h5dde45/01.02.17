package sl.t12;

public class CloneRunner {
    public static void main(String[] args) {
        Man man=new Man();
        System.out.println(man.getId());

        mutation(man);
        System.out.println(man.getId());

    }
    private static void mutation(Man man){
        try {
            man= man.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        man.setId(222);
        System.out.println(man.getId());
    }
}
