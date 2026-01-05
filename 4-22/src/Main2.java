import java.io.*;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "excersise.properties";
        Properties properties = new Properties();
        // プロパティファイルを作成
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            properties.setProperty("username", "testuser");
            properties.setProperty("password", "123456");
            System.out.println("プロパティファイルを作成しました: " + filePath);
            properties.store(fos, "test properties");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
