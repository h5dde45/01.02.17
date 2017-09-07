package sl.t8;

enum Day implements Runnable {
    D1(7, "7"),
    D2(1, "1"),
    D3(2, "2"),
    D4(3, "3"),
    D5(4, "4"),
    D6(5, "5"),
    D7(6, "6");

    Day(int order, String descr) {
        this.order = order;
        this.descr = descr;
    }

    int order;
    String descr;

    @Override
    public void run() {
        System.out.println(name() + ", " + toString());
    }

    @Override
    public String toString() {
        return "Day{" +
                "order=" + order +
                ", descr='" + descr + '\'' +
                '}';
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            day.run();
        }
    }
}
