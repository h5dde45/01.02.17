package sl.t21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        String fPath="in.txt";
        int i;

        File f=new File(fPath);
        try (FileReader fr=new FileReader(f  )){
            while ((i=fr.read())!=-1){
                System.out.print((char) i);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}
