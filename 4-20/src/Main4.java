import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main4 {
    public static void main(String[] args) {

        // パス定義
        Path source = Path.of("source.txt");
        Path backupDir = Path.of("backup");
        Path archiveDir = Path.of("archive");

        Path backupFile = backupDir.resolve("source.txt");
        Path archiveFile = archiveDir.resolve("source.txt");

        try {
            // ===== フォルダ作成（存在しなければ） =====
            Files.createDirectories(backupDir);
            Files.createDirectories(archiveDir);
            Files.writeString(source, "This is a source file."); // ソースファイル作成

            // ===== コピー処理 =====
            Files.copy(source, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("ファイルが 'backup/' にコピーされました。");

            // コピー確認
            if (Files.exists(backupFile)) {
                System.out.println("コピーの確認: 成功");
            } else {
                System.out.println("コピーの確認: 失敗");
            }

            // ===== 移動処理 =====
            Files.move(backupFile, archiveFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("ファイルが 'archive/' に移動されました。");

            // 移動確認
            if (Files.exists(archiveFile)) {
                System.out.println("移動の確認: 成功");
            } else {
                System.out.println("移動の確認: 失敗");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
