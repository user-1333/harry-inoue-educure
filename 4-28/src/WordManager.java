import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

class WordManagerTest {

    @Test
    void testAddWord() {
        WordManager wordManager = new WordManager();
        Word word1 = new Word("apple", "りんご");
        Word word2 = new Word("ice cream", "アイスクリーム");
        Word word3 = new Word("e-mail", "メール");
        wordManager.addWord(word1);
        wordManager.addWord(word2);
        wordManager.addWord(word3);
        String expected = "[Word(english=apple, japanese=りんご), Word(english=ice cream, japanese=アイスクリーム), Word(english=e-mail, japanese=メール)]";
        assertEquals(expected, wordManager.getWords().toString(),"単語の追加に失敗しました。");
    }
    @Test
    void testAddWordEmpty() {
        WordManager wordManager = new WordManager();
        Word word1 = new Word("", "りんご");
        Word word2 = new Word("ice cream", "");
        wordManager.addWord(word1);
        wordManager.addWord(word2);
        String expected = "[]";
        assertEquals(expected, wordManager.getWords().toString(),"空の単語または訳語が追加されました。");
    }
    @Test
    void testGetWordCount() {
        WordManager wordManager = new WordManager();
        Word word1 = new Word("apple", "りんご");
        Word word2 = new Word("ice cream", "アイスクリーム");
        Word word3 = new Word("e-mail", "メール");
        wordManager.addWord(word1);
        wordManager.addWord(word2);
        wordManager.addWord(word3);
        int expected = 3;
        assertEquals(expected, wordManager.getWordCount(),"単語数の取得に失敗しました。");
    }
}