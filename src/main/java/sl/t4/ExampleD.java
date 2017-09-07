package sl.t4;

public class ExampleD {
    public static void main(String[] args) {
        Exam<Double> md1 = new Exam<>("Math", 75.95);
        Exam<Double> md2 = new Exam<>("Math", 75.75);

        System.out.println(md1.equalsTomark(md2));

        Exam<Integer> mi=new Exam<>("Math",76);
        System.out.println(mi.equalsTomark(md1));
    }
}

class Exam<T extends Number> {
    private String name;
    private T mark;

    public Exam(String name, T mark) {
        this.name = name;
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark() {
        return Math.round(mark.floatValue());

    }

//    public boolean equalsTomark(Exam<T> obj) {
//        return roundMark() == obj.roundMark();
//    }
//    public boolean equalsTomark(Exam<?> obj) {
//        return roundMark() == obj.roundMark();
//    }

    public boolean equalsTomark(Exam<? extends Number> obj) {
        return roundMark() == obj.roundMark();
    }
}
