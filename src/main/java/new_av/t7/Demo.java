package new_av.t7;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path dir= Paths.get("\\java_projects\\july2017");

        long count = Files.walk(dir)
                .filter(path -> path.toString().endsWith(".java"))
                .peek(System.out::println)
                .flatMap(path -> {
                    try {
                        return Files.lines(path);
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                })
                .filter(s -> s.contains("Java"))
                .peek(System.err::println)
                .count();

        System.out.println(count);
    }
}
