import java.io.IOException;
import java.util.Scanner;

public class VocabularyApp {
    private final WordManager wordManager;
    private final Quiz quiz;
    private final FileHandler fileHandler;
    private final Scanner sc;

    public static void main(String[] args) {
        VocabularyApp app = new VocabularyApp();
        app.start();
    }
    VocabularyApp() {
        this.wordManager = new WordManager();
        this.quiz = new Quiz(wordManager);
        this.fileHandler = new FileHandler();
        this.sc = new Scanner(System.in);
    }
    void start(){
        while(true){
            System.out.println("1：単語を登録する");
            System.out.println("2：クイズを受ける");
            System.out.println("3：CSVファイルから単語をインポート");
            System.out.println("4：CSVファイルに単語をエクスポート");
            System.out.println("5：終了する");

            int input = this.sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("英単語を入力してください：");
                    String en = sc.next();
                    System.out.println("日本語訳を入力してください：");
                    String ja = sc.next();
                    System.out.println("単語を登録しました。");
                    wordManager.addWord(new Word(en,ja));
                    break;
                case 2:
                    int count = wordManager.getWords().size();
                    if (count == 0){
                        System.out.println("単語が登録されていません。");
                        break;
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.println(i);
                        Word word = quiz.getRandomWord();
                        String answer = sc.next();
                        quiz.checkAnswer(word,answer);
                    }
                    quiz.getTotalQuestions();
                    break;
                case 3:
                    System.out.println("CSVファイル名を入力してください：");
                    String fileName = sc.next();
                    try {
                        fileHandler.importFromCSV(fileName,wordManager);
                    } catch (IOException e) {
                        System.out.println("error");
                    }
                    break;
                case 4:
                    System.out.println("CSVファイル名を入力してください：");
                    fileName = sc.next();
                    if (!(fileName.equals("words.csv"))) {
                        System.out.println("error");
                    }
                    try {
                        fileHandler.exportToCSV(wordManager.getWords(),fileName);
                    } catch (IOException e) {
                        System.out.println("error");
                    }
                        break;
                case 5:
                    System.out.println("削除する英単語を入力してください：");
                    String deleteEn = sc.next();
                    wordManager.deleteword(deleteEn);
                    System.out.println("単語を削除しました。");
                    break;
                case 6:
                    System.out.println("更新する英単語を入力してください：");
                    String updateEn = sc.next();
                    System.out.println("新しい日本語訳を入力してください：");
                    String updateJa = sc.next();
                    wordManager.updateWord(updateEn,updateJa);
                    System.out.println("単語を更新しました。");
                    break;
                case 7:
                    System.out.println("終了します。");
                    return;
            }
        }
    }
}