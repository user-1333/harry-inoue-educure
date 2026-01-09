import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WordManager {
    List<Word> words = new ArrayList<Word>();

    public void addWord(Word word) {
        words.add(word);
    }

    public int getWordCount(){
        System.out.println("Word count: " + words.size());
        return words.size();
    }
}
