import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        record Card(String en, String jp) {}

        var cards = new ArrayList<Card>();
        boolean isRunning = true;

        while (isRunning) {
            // メニュー表示
            System.out.println("1：単語を登録する");
            System.out.println("2：クイズを受ける");
            System.out.println("3：終了する");
            System.out.print("メニュー選択: ");

            int menuNo;
            try {
                menuNo = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("1〜3の数字を入力してください。");
                continue;
            }

            switch (menuNo) {
                case 1 -> {
                    if (cards.size() >= 20) {
                        System.out.println("登録可能な単語数は20個までです");
                        break;
                    }

                    System.out.print("英語: ");
                    String en = input.nextLine();

                    System.out.print("日本語: ");
                    String jp = input.nextLine();

                    cards.add(new Card(en, jp));
                    System.out.println("単語を登録しました。");
                }

                case 2 -> {
                    if (cards.isEmpty()) {
                        System.out.println("単語が登録されていません");
                        break;
                    }

                    int correct = 0;

                    for (var card : cards) {
                        System.out.println("次の英単語を日本語にしてください：");
                        System.out.println(card.en());

                        String answer = input.nextLine();

                        if (answer.equals(card.jp())) {
                            System.out.println("正解！");
                            correct++;
                        } else {
                            System.out.println("不正解。正解は「" + card.jp() + "」です。");
                        }
                    }

                    System.out.println(
                            cards.size() + "問中" + correct + "問正解でした！"
                    );
                }

                case 3 -> {
                    isRunning = false;
                    System.out.println("終了します。");
                }

                default -> System.out.println("1〜3の数字を入力してください。");
            }
        }
    }
}
