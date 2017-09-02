package va.t6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPath {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("src/main/java/va");
        System.out.println(path.isAbsolute());
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(1));

        System.out.println("******************");

        System.out.println(Files.exists(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path).toMillis());

        try (DirectoryStream<Path> directoryStream=Files.newDirectoryStream(path)){
            for(Path path1:directoryStream){
                System.out.println(path1);
            }
        }

        Path path1= Paths.get("src/main/java/va/t6/new.txt");
        Path path2= Paths.get("src/main/java/va/new.txt");
//        System.out.println(Files.createFile(path1));
//        Files.delete(path1);
//        System.out.println(Files.move(path1,path2));
//        System.out.println(Files.copy(path2,path1));



    }
}
