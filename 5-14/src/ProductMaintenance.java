import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductMaintenance {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/educure_db";
        String user = "postgres";
        String password = "user";

        String updatePriceZeroSQL =
                "UPDATE products SET price = 0 WHERE stock = 0";

        String deleteHighPriceSQL =
                "DELETE FROM products WHERE price >= 200000";

        String updateStockSQL =
                "UPDATE products SET stock = 20 WHERE price >= 100000 AND stock <= 10";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            conn.setAutoCommit(false);

            // ① 在庫0 → 価格0
            try (PreparedStatement stmt1 = conn.prepareStatement(updatePriceZeroSQL)) {
                int rows1 = stmt1.executeUpdate();
                System.out.println("影響を受けた行数 (在庫数0の商品価格を0に設定):" + rows1);
            }

            // ② 価格200000以上 → 削除
            try (PreparedStatement stmt2 = conn.prepareStatement(deleteHighPriceSQL)) {
                int rows2 = stmt2.executeUpdate();
                System.out.println("影響を受けた行数 (価格が200000以上の商品削除):" + rows2);
            }

            // ③ 価格100000以上 & 在庫10以下 → 在庫20
            try (PreparedStatement stmt3 = conn.prepareStatement(updateStockSQL)) {
                int rows3 = stmt3.executeUpdate();
                System.out.println("影響を受けた行数 (価格100000以上、在庫数10以下の商品を在庫数20に更新): " + rows3);
            }
            conn.commit();

        } catch (SQLException e) {
            System.out.println("エラーが発生したためロールバックします。");
            e.printStackTrace();
        }
    }
}
