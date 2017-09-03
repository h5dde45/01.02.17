package va.t7;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("c:/java_projects");

        try (Stream<Path> files= Files.walk(dir)) {
            long count = files
                    .filter((p) -> p.toString().endsWith(".java"))
                    .peek(System.out::println)
                    .flatMap(Demo::getLines)
                    .filter((s) -> s.contains("new"))
                    .peek(System.err::println)
                    .count();

            System.out.println(count);
        }

    }

    private static Stream<String> getLines(Path file) {
            try {
                return Files.lines(file);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
    }
}
