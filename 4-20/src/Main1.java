import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("exercise.txt");
        fw.write("Hello, World!");
        fw.close();
        System.out.println("File written successfully.");
    }
}