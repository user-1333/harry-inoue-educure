import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("攻撃力を入力してください：");
        int attackPower = input.nextInt();
        System.out.print("防御力を入力してください：");
        int enemyDefense = input.nextInt();
        int damageDealt = attackPower - enemyDefense;
        int critalDamage = (int)(damageDealt * 1.5);
        System.out.println("与えたダメージは" + damageDealt);
        System.out.println("クリティカルダメージは" + critalDamage);
        input.close();
    }
}
