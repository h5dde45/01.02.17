package sl.t21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArrDemo {
    public static void main(String[] args) {
        String[] strings={"one","two","3"};

        File fByte=new File("byte.data");
        File fSymbol=new File("symbol.txt");

        try (
                FileOutputStream fos=new FileOutputStream(fByte);
                FileWriter fw=new FileWriter(fSymbol);
                ){

            for(String s:strings){
                fos.write(s.getBytes());
                fw.write(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
