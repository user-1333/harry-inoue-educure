import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuizTest {
    @org.junit.jupiter.api.Test
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
    @org.junit.jupiter.api.Test
    void testAddWordEmpty() {
        WordManager wordManager = new WordManager();
        Word word1 = new Word("", "りんご");
        Word word2 = new Word("ice cream", "");
        wordManager.addWord(word1);
        wordManager.addWord(word2);
        String expected = "[]";
        assertEquals(expected, wordManager.getWords().toString(),"空の単語または訳語が追加されました。");
    }
    @org.junit.jupiter.api.Test
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
