import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(words.stream().map(String::toUpperCase).toList());
    }
}
