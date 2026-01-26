import java.math.BigDecimal;
import java.sql.*;

public class InsertProduct {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String user = "postgres"; // データベースのユーザー名
        String password = "user"; // データベースのパスワード

        String insertSQL = "INSERT INTO products (product_name, price, stock) VALUES (?, ?, ?)";
        // ここにコードを書いてください
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            // パラメータの設定
            pstmt.setString(1, "スマートフォン");
            pstmt.setBigDecimal(2, new BigDecimal("80000"));
            pstmt.setInt(3, 30);

            // SQLの実行
            pstmt.executeUpdate();
            System.out.println("商品が正常に追加されました。");
            try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                 ResultSet rs = stmt.executeQuery("SELECT * FROM products")) {
                ResultSetPrinter.print(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}