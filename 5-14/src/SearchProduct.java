import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchProduct {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "postgres";
        String password = "user";

        String query = "SELECT product_name, price FROM products WHERE price >= ?";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            // 価格条件を設定
            pstmt.setInt(1, 100000);

            // SQL実行
            ResultSet rs = pstmt.executeQuery();

            // 結果セットの処理
            while (rs.next()) {
                String productName = rs.getString("product_name");
                int price = rs.getInt("price");

                System.out.println("商品名: " + productName + ", 価格: " + price);
            }

        } catch (SQLException e) {
            // 例外発生時はスタックトレースを表示
            e.printStackTrace();
        }
    }
}
