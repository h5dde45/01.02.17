package as.t14;

import java.io.*;

public class FileFirst {
    public static void main(String[] args) throws IOException {

        try (InputStream is = new FileInputStream("\\Users\\н\\Desktop/mp4.mp3");
             OutputStream os = new FileOutputStream("test.mp3")) {

            byte[] buffer = new byte[4096];
            int r = is.read(buffer);
            while (r != -1) {
                os.write(buffer, 0, r);
                r = is.read(buffer);

            }
        }
    }
}
