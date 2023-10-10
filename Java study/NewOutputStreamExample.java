import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewOutputStreamExample {

    public static void main(String... args) throws IOException {
        Path path = Files.createTempFile("test-file", ".txt");
        System.out.println("-- writing to file --");
        try (OutputStream outputStream = Files.newOutputStream(path)) {
            outputStream.write("test file content....".getBytes());
        }

        System.out.println("-- reading from file --");
        Files.readAllLines(path)
             .forEach(System.out::println);
    }
}