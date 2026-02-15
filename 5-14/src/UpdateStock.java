import java.sql.*;

public class UpdateStock {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/educure_db"; // データベースURL
        String user = "postgres"; // データベースのユーザー名
        String password = "user"; // データベースのパスワード
        String checkStockSQL = "SELECT COUNT(*) FROM products WHERE stock > 0";
        String updateSQL = "UPDATE products SET stock = CASE WHEN stock >= 10 THEN stock - 10 ELSE 0 END";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement checkStmt = conn.prepareStatement(checkStockSQL);
             PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {

            // 在庫がある商品が存在するか確認
            ResultSet rs = checkStmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);

            if (count == 0) {
                System.out.println("エラー：在庫がすべて0のため更新できません。");
                return;
            }

            // 更新実行
            int updatedRows = updateStmt.executeUpdate();

            if (updatedRows > 0) {
                System.out.println("在庫が正常に更新されました。");
            } else {
                System.out.println("更新対象の商品がありませんでした。");
            }

        } catch (SQLException e) {
            System.out.println("エラーが発生しました。");
            System.out.println("詳細: " + e.getMessage());
        }

    }
}