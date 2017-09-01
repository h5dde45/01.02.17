package va.t3.sub;

import va.t3.p1.MyInteger;

public class Main {
    public static void main(String[] args) {
        MyInteger.Bar bar=new MyInteger(11).new Bar();
        bar.bar();
        MyInteger myInteger=new MyInteger(34);
        MyInteger.Bar bar1= myInteger.newBar();
        bar1.bar();
    }
}
