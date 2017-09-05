package as.t5;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class SimpleProcess {
    public static final int TAST_COUNT=500_000;
    public static void main(String[] args) {

        Long sum=0L;
        List<SingleProcess> list=new ArrayList<>();
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            SingleProcess sp=new SingleProcess("ID: "+i);
           new Thread(sp).start();
           list.add(sp);
//            sum+=sp.process();
        }
        System.out.println();
        System.out.println((System.currentTimeMillis()-startTime)/1000+" sec");

    }
}
class SingleProcess implements Runnable
//        extends Thread
{

    private String name;
    private Long summa=0L;

    public SingleProcess(String name) {
        this.name = name;
    }

    public Long getSumma() {
        return summa;
    }

    public Long process() {
        Long sum=0L;
        SecureRandom random=new SecureRandom();
        for (int i = 0; i < SimpleProcess.TAST_COUNT; i++) {
            String s=new BigInteger(500,random).toString(32);
            for (char c:s.toCharArray()){
                sum+=c;
            }
        }
        System.out.println(name);
        return sum;
    }

    @Override
    public void run() {
       summa= process();
    }
}