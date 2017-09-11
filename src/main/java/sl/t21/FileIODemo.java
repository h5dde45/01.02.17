package sl.t21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {

        String fPath = "in.txt";
        String fResult = "result.txt";

        try (
                FileInputStream fis = new FileInputStream(fPath);
                FileOutputStream fos = new FileOutputStream(fResult);
        ) {
            int ch = fis.read();
            while (ch != -1) {
                fos.write(ch);
                ch = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
