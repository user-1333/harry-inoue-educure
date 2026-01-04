import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {

        // フォルダ名とファイル名
        String folderName = "exercise_folder";
        String fileName = "exercise_file.txt";

        File folder = new File(folderName);

        // ===== フォルダ作成処理 =====
        if (folder.exists()) {
            System.out.println("フォルダは既に存在します。");
        } else {
            boolean created = folder.mkdir();
            if (created) {
                System.out.println("フォルダを作成しました。");
            } else {
                System.out.println("フォルダの作成に失敗しました。");
                return; // フォルダ作成失敗時は終了
            }
        }

        // ===== ファイル作成処理 =====
        File file = new File(folder, fileName);

        if (file.exists()) {
            System.out.println("ファイルは既に存在します。");
        } else {
            try {
                boolean createdFile = file.createNewFile();
                if (createdFile) {
                    System.out.println("ファイルを作成しました。");
                }
            } catch (IOException e) {
                System.out.println("ファイルの作成中にエラーが発生しました。");
            }
        }
    }
}
