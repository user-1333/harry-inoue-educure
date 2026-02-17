import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {

    public void exportToCSV(List<Word> words, String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            for (Word word : words) {
                fw.write(word.getEnglish() + "," + word.getJapanese() + "\n");
            }
        }
    }

    public void importFromCSV(String filename, WordManager wordManager) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    Word word = new Word(parts[0], parts[1]);
                    wordManager.addWord(word);
                    count++;
                }
            }
            System.out.printf("%d個の単語を読み込みました。\n", count);
        }
    }
}
