import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "date", "cherry", "elderberry");
        System.out.println(words.stream().sorted().toList());
    }
}
