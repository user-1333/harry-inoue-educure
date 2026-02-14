import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler {

    void exportToCSV(List<Word> words, String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (Word word : words) {
            fw.write(word.getEnglish() + "," + word.getJapanese() + "\n");
        }
        fw.close();
    }
    void importFromCSV(String filename,WordManager wordManager)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                Word word = new Word(parts[0], parts[1]);
                wordManager.addWord(word);
            }
            i++;
        }
        System.out.printf("%s個の単語を読み込みました。",i);
        br.close();
    }
}
