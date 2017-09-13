package new_av.t6.p1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("C:\\java_projects\\july2017\\01_09_17\\ras.txt");
        Path path2= Paths.get("ras.txt");
        System.out.println(path.isAbsolute());
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(2));
        System.out.println(Files.exists(path));
        System.out.println(Files.exists(path2));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path).toMillis());
        System.out.println("**************");
        Path dir= Paths.get("C:\\java_projects\\july2017\\01_09_17\\src\\main\\java\\new_av");
        System.out.println(Files.exists(dir));
        System.out.println(Files.isDirectory(dir));

        try (DirectoryStream<Path> paths=Files.newDirectoryStream(dir)){
            for(Path path1:paths){
                System.out.println(path1);
            }
        }


    }
}
