import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main1 {
    public static void main(String[] args) {

        try {
            // 検索キーワード
            String keyword = "Java";
            String encodedKeyword = java.net.URLEncoder.encode(keyword, StandardCharsets.UTF_8);
            String searchURL =
                    "https://www.google.com/search?q=" + encodedKeyword;
            URL url = new URL(searchURL);
            // ストリーム取得
            InputStream is = url.openStream();
            int data;
            while ((data = is.read()) != -1) {
                System.out.print((char) data);
            }

            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
