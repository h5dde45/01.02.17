package sl.t8;

enum DayOfWeek{
    DAY1,
    DAY2,
    DAY3,
    DAY4,
    DAY5,
    DAY6,
    DAY7
}

public class EnumDemo1 {
    public static void main(String[] args) {

        DayOfWeek d1;
        DayOfWeek d2;
        DayOfWeek d3;

        for (DayOfWeek dayOfWeek: DayOfWeek.values()){
            System.out.println(dayOfWeek.ordinal()+" - "+dayOfWeek);
        }

        System.out.println("******************");

        d1=DayOfWeek.DAY2;
        d2=DayOfWeek.DAY5;
        d3=DayOfWeek.DAY2;

        System.out.println(d1.compareTo(d2));
        System.out.println(d1.compareTo(d3));
        System.out.println(d3.compareTo(d2));

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1==d3);



    }
}

