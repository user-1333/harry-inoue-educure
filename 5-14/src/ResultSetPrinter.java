import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetPrinter {

    public static void print(ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        int columnCount = meta.getColumnCount();

        int[] widths = new int[columnCount];

        // 列名の幅を初期値に
        for (int i = 1; i <= columnCount; i++) {
            widths[i - 1] = meta.getColumnLabel(i).length();
        }

        // 一度全行を走査して最大幅を計算
        rs.beforeFirst(); // ←重要（後述）
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                Object value = rs.getObject(i);
                int len = String.valueOf(value).length();
                widths[i - 1] = Math.max(widths[i - 1], len);
            }
        }

        rs.beforeFirst(); // 先頭に戻す

        // 区切り線
//        printLine(widths);

        // ヘッダー
        for (int i = 1; i <= columnCount; i++) {
            System.out.printf("| %-" + widths[i - 1] + "s ", meta.getColumnLabel(i));
        }
        System.out.println("|");

        printLine(widths);

        // データ行
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("| %-" + widths[i - 1] + "s ", rs.getObject(i));
            }
            System.out.println("|");
        }

//        printLine(widths);
    }

    private static void printLine(int[] widths) {
        for (int w : widths) {
            System.out.print("|");
            System.out.print("-".repeat(w + 2));
        }
        System.out.println("|");
    }
}