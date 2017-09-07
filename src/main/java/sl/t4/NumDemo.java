package sl.t4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumDemo {
    public static void main(String[] args) {
        List<Number> list=new ArrayList<>();
        list.add((byte)25);
        list.add((short)29000);
        list.add(1900_000_000);
        list.add(2900_000_000L);
        list.add((float)4.);
        list.add(4.);
        list.add(new BigInteger("12345678901112131415"));
        list.add(new BigDecimal("2.3e309"));

        for (Number number:list){
            System.out.println(number);
        }

    }
}
