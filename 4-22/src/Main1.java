import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        String fileName = "excersise.csv";

        // CSVファイルを作成
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("名前,年齢,職業");
            writer.println("山田,28,プログラマー");
            System.out.println("CSVファイルを作成しました: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // CSVファイルを読み込む
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine(); // ヘッダー行をスキップ
            String line = br.readLine(); // データの1行目を取得
            // ここにコードを書いてください
            if (line != null) {
                String[] values = line.split(",");
                String name = values[0];
                String age = values[1];
                String occupation = values[2];
                System.out.println("名前: " + name);
                System.out.println("年齢: " + age);
                System.out.println("職業: " + occupation);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}