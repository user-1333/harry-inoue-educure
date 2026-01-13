import lombok.Getter;

import java.util.Collections;

public class Quiz {
    @Getter
    private int score;
    private int totalQuestions;
    private final WordManager wordManager;

    Quiz(WordManager wordManager) {
        this.wordManager = wordManager;
    }

    public Word getRandomWord(){
        int size = wordManager.getWordCount();
        Collections.shuffle(wordManager.getWords());
        int randomIndex = (int)(Math.random() * size);
        Word randomWord = wordManager.getWords().get(randomIndex);
        System.out.println("日本語に翻訳: " + randomWord.getEnglish());
        return randomWord;
    }

    public void checkAnswer(Word word, String answer){
        if(word.getJapanese().equals(answer)){
            score++;
            System.out.println("正解!");
        } else {
            System.out.println("残念！正解は: " + word.getJapanese());
        }
        totalQuestions++;
    }
    public void getTotalQuestions(){
        System.out.printf("%d問中%d問正解しました。\n", totalQuestions, score);
    }

}
