// 3)Use rangeClosed to create a  Stream

import java.util.stream.IntStream;

public class Quest3 {
    // Use rangeClosed to create a Stream
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }
}
