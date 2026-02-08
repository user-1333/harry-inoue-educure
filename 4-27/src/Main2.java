import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main2 {
    public static void main(String[] args) {
        try {
            // 検索キーワードをCQL形式で設定
            String query = "title = Java"; // CQL形式
            String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8);

            // 国立国会図書館APIのエンドポイント
            String endpoint = "https://ndlsearch.ndl.go.jp/api/sru";

            // APIリクエストのURLを構築
            String requestUrl = endpoint
                    + "?operation=searchRetrieve"
                    + "&version=1.2"
                    + "&query=" + encodedQuery
                    + "&maximumRecords=10"
                    + "&recordSchema=dc";

            // ===== ここから実装 =====

            // URLクラスを使用してURLオブジェクトを作成
            URL url = new URL(requestUrl);

            // HTTP接続を確立
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // レスポンスを読み込み、XMLをコンソールに出力
            InputStream is = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // ストリームを閉じる
            reader.close();
            is.close();
            conn.disconnect();

        } catch (Exception e) {
            // 例外発生時はスタックトレースを表示
            e.printStackTrace();
        }
    }
}
