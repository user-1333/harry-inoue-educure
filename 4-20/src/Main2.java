import java.io.FileReader;

public class Main2 {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("exercise.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("ファイルの読み込み中にエラーが発生しました。");
        }
    }
}
