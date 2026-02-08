import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WordManager {
    List<Word> words = new ArrayList<Word>();

    public void addWord(Word word) {
        if (word.getEnglish().isEmpty() || word.getJapanese().isEmpty()) {
            System.out.println("単語または訳語が空です。登録できません。");
            return;
        }
        words.add(word);
    }

    public int getWordCount(){
        System.out.println("Word count: " + words.size());
        return words.size();
    }
}