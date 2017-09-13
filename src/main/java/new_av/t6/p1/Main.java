package new_av.t6.p1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\java_projects\\july2017\\01_09_17\\ras.txt");
        File file2=new File("ra2s.txt");

        System.out.println(file.isAbsolute());
        System.out.println(file2.isAbsolute());

        System.out.println(file.getPath());
        System.out.println(file2.getPath());
        System.out.println(file.getName());
        System.out.println(file2.getName());
        System.out.println(file.getParent());
        System.out.println(file2.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file2.getCanonicalPath());

        System.out.println("*****************");
        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
        System.out.println("******************");

        File dir=new File("C:\\java_projects\\july2017\\01_09_17\\src\\main\\java\\new_av\\t6");
        File dir2=new File("src\\main\\java\\new_av");
        File dir3=new File("src\\main\\java\\n4ew_av");
        System.out.println(dir.exists());
        System.out.println(dir2.exists());
        System.out.println(dir.isDirectory());
        System.out.println(dir2.isDirectory());
        System.out.println(dir.isFile());
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(Arrays.toString(dir2.list()));
        System.out.println(Arrays.toString(dir3.list()));
        System.out.println(Arrays.toString(dir.listFiles()));
        System.out.println(Arrays.toString(dir2.listFiles()));
        System.out.println();
        System.out.println();


    }
}
