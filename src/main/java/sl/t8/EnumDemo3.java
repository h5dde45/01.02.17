package sl.t8;

enum Day1 {
    D1(7, "7") {
        @Override
        public String shortName() {
            return "77";
        }
    },
    D2(1, "1") {
        @Override
        public String shortName() {
            return "11";
        }
    },
    D3(2, "2") {
        @Override
        public String shortName() {
            return "22";
        }
    },
    D4(3, "3") {
        @Override
        public String shortName() {
            return "33";
        }
    },
    D5(4, "4") {
        @Override
        public String shortName() {
            return "44";
        }
    },
    D6(5, "5") {
        @Override
        public String shortName() {
            return "55";
        }
    },
    D7(6, "6") {
        @Override
        public String shortName() {
            return "66";
        }
    };

    Day1(int order, String descr) {
        this.order = order;
        this.descr = descr;
    }

    public abstract String shortName();

    int order;
    String descr;
}

public class EnumDemo3 {
    public static void main(String[] args) {

        for (Day1 day:Day1.values()){
            System.out.println(day.shortName());
        }

    }

}
