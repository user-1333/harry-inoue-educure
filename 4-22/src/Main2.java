import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "excersise.properties";
        Properties properties = new Properties();

        // プロパティファイルを読み込む
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);

            // 値を取得
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            System.out.println("username = " + username);
            System.out.println("password = " + password);

        } catch (IOException e) {
            System.out.println("プロパティファイルの読み込み中にエラーが発生しました: " + e.getMessage());
        }
    }
}
