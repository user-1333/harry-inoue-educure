import java.util.ArrayList;
import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        record Card(String jp,String en) {};
        var cards = new ArrayList<Card>();
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("メニュー選択: ");
            int menuNo = input.nextInt();
            if (menuNo == 3) {isRunning = false;}
            if (menuNo == 1) {
                if (cards.size() > 20) {
                    System.out.println("単語帳がいっぱいです。");
                    continue;
                }
                System.out.print("英語: ");
                String en = input.next();
                System.out.print("日本語: ");
                String jp = input.next();
                cards.add(new Card(jp,en));
            }
            if (menuNo == 2) {
                int correct = 0;
                for (var card : cards) {
                    System.out.println("英語にせよ\n" + card.jp());
                    String answer = input.next();
                    if (answer.equals(card.en())) {
                        System.out.println("正解");
                        correct++;
                    }
                }
                System.out.println("結果: " + correct + " / " + cards.size());
            }
        }

    }
}