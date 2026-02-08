import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter fw = new FileWriter("exercise.txt");
            fw.write("Hello, World!");
            fw.close();
            System.out.println("ファイルに書き込みが完了しました。");
        } catch (IOException e){
            System.out.println("ファイルの書き込み中にエラーが発生しました。");

        }
    }
}