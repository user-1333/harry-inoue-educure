public class Main2 {
    public static void main(String[] args) {
        int points = 185;
        if (points >= 100) {
            System.out.println("無効な点数です。");
            return;
        }
        if (points >= 60) {
            System.out.println("合格です。");
        } else {
            System.out.println("不合格です。");
        }
    }
}
