import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("現在の経験値を入力してください：");
        int xp = Integer.parseInt(input.next());
        int bonusRate = 25;
        int totalXP = xp + (xp * bonusRate / 100);
        System.out.println("ボーナス経験値を加えた合計経験値は" + totalXP);
        input.close();
    }
}
