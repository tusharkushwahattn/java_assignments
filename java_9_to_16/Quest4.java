
// 4)Use iterator stream method to generate a stream
import java.util.stream.IntStream;

public class Quest4 {
    // Use iterator stream method to generate a stream
    public static void main(String[] args) {
        IntStream
                .iterate(0, i -> i <= 10, i -> i + 1)
                .forEach(System.out::println);
    }
}
