import java.sql.*;

public class DBManager {
    private final String url = "jdbc:postgresql://localhost:5432/vocabulary_db";
    private final String username = "postgres";
    private final String password = "user";
    private Connection conn = null;
    public DBManager() {
        initializeDatabase();
    }
    public Connection getConnection() {
        return this.conn;
    }
    void initializeDatabase(){
        try {
            this.conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void close() {
        if (this.conn != null) {
             try {
                 this.conn.close();
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
        }
    }



//    public void Insert(String english, String japanese){
//        String sql = "INSERT INTO words (english, japanese) VALUES (?, ?)";
//        try (   Connection conn = DriverManager.getConnection(url, username, password);
//                PreparedStatement pstmt = conn.prepareStatement(sql)){
//            pstmt.setString(1, english);
//            pstmt.setString(2, japanese);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void Update(String english, String japanese){
//            String sql = "UPDATE words SET japanese = ? WHERE english = ?";
//        try (   Connection conn = DriverManager.getConnection(url, username, password);
//                PreparedStatement pstmt = conn.prepareStatement(sql)){
//            pstmt.setString(1, japanese);
//            pstmt.setString(2, english);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//     public void Delete(String english){
//        String sql = "DELETE FROM words WHERE english = ?";
//        try (   Connection conn = DriverManager.getConnection(url, username, password);
//                PreparedStatement pstmt = conn.prepareStatement(sql)){
//            pstmt.setString(1, english);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}

//class VocabularyDBConnection {
//    public static void main(String[] args) {
//        String url = "jdbc:postgresql://localhost:5432/vocabulary_db";
//        String username = "postgres";
//        String password = "user";
//        Connection connection = null;
//        try {
//            connection = new DBManager(url, username, password).getConnection();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
