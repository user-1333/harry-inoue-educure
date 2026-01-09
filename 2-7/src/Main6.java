import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("現在の経験値を入力してください：");
        int xp = Integer.parseInt(input.next());
        int bonusRate = 25;
        int totalXP = xp + (xp * bonusRate / 100);
        System.out.println("ボーナス後の経験値：" + totalXP);
        input.close();
    }
}
