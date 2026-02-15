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
}
