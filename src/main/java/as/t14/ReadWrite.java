package as.t14;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
//            demoReadWrite();
//            demoInputOutput();

    }

    public static void demoReadWrite() throws IOException {
        try (Reader reader = new FileReader("textR.txt");
             Writer writer = new FileWriter("testW.txt",true)) {
            char[]chars=new char[4096];
            int c = reader.read(chars);
            while (c != -1) {
                writer.write(chars,0, c);
                c = reader.read(chars);
            }
        }
    }

    public static void demoInputOutput() throws IOException {
        try (InputStream is = new FileInputStream("\\Users\\н\\Desktop/mp4.mp3");
             OutputStream os = new FileOutputStream("test.mp3")) {
            byte[] buf = new byte[2048];
            int r = is.read(buf);
            while (r != -1) {
                os.write(buf, 0, r);
                r = is.read(buf);
            }
        }
    }
}

