package sl.t14;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileD {
    public static void main(String[] args) {

        String fPath="C:\\java_projects\\july2017\\01_09_17/ras.txt";

        try (
                RandomAccessFile fileR=new RandomAccessFile(fPath,"r");
                RandomAccessFile fileRW=new RandomAccessFile(fPath,"rw");
                RandomAccessFile fileRW1=new RandomAccessFile("ras1.txt","rw");
                ){

            String tmp="";
            while ((tmp=fileR.readLine())!=null){
                System.out.println(tmp);
            }
            System.out.println("**********************");

            fileR.seek(3);
            byte[]bytes=new byte[12];
            fileR.read(bytes);
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));
            System.out.println("=========================");

            fileRW.seek(3);
            fileRW.write("++ ++".getBytes());

            fileRW1.seek(4);
            fileRW1.write("new Message".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
