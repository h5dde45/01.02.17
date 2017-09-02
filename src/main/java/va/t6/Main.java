package va.t6;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\н\\Desktop/sample.txt");
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isAbsolute());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.length());
        System.out.println(file.lastModified());


        System.out.println("***************************");

        File file2=new File("src/main/java/va/t6/text.txt");
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.isAbsolute());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getCanonicalPath());
        System.out.println(file2.exists());
        System.out.println(file2.isFile());
        System.out.println(file2.canRead());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

        System.out.println("***************************");
        System.out.println("***************************");

        File dir1=new File("C:/java_projects\\july2017\\01_09_17\\src\\main\\java\\va");
        System.out.println(dir1.isDirectory());
        System.out.println(dir1.exists());
        System.out.println(Arrays.toString(dir1.list()));
        System.out.println(Arrays.toString(dir1.listFiles()));

        System.out.println("***************************");

        File dir2=new File("src/main/java/va");
        System.out.println(dir2.isDirectory());
        System.out.println(dir2.exists());
        System.out.println(Arrays.toString(dir2.list()));
        System.out.println(Arrays.toString(dir2.listFiles()));



    }
}
