
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Word word = new Word("hello", "こんにちは");
        System.out.println(word.toString());
        WordManager wordManager = new WordManager();
        wordManager.addWord(word);
        System.out.println("Total words: " + wordManager.getWordCount());
        System.out.println(wordManager.getWords());
    }
}