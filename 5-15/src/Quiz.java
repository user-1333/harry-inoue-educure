import lombok.Getter;

public class Quiz {
    @Getter
    private int score;
    private int totalQuestions;
    private final WordManager wordManager;

    Quiz(WordManager wordManager) {
        this.wordManager = wordManager;
        this.score = 0;
        this.totalQuestions = 0;
    }

    public void resetScore() {
        this.score = 0;
        this.totalQuestions = 0;
    }

    public Word getRandomWord() {
        int size = wordManager.getWordCount();
        if (size == 0) {
            throw new IllegalStateException("単語が登録されていません");
        }
        System.out.println("単語数: " + size);
        int randomIndex = (int) (Math.random() * size);
        Word randomWord = wordManager.getWords().get(randomIndex);
        System.out.println("日本語に翻訳: " + randomWord.getEnglish());
        return randomWord;
    }

    public void checkAnswer(Word word, String answer) {
        if (word.getJapanese().equals(answer)) {
            score++;
            System.out.println("正解!");
        } else {
            System.out.println("残念！正解は: " + word.getJapanese());
        }
        totalQuestions++;
    }

    public void getTotalQuestions() {
        System.out.printf("%d問中%d問正解しました。\n", totalQuestions, score);
    }

}
