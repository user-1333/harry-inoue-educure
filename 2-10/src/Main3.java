public class Main3 {
    public static void main(String[] args) {
        int month = 4;
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5) {
                System.out.println("春です。");
            } else if (month >= 6 && month <= 8) {
                System.out.println("夏です。");
            } else if (month >= 9 && month <= 11) {
                System.out.println("秋です。");
            } else {
                System.out.println("冬です。");
            }
        } else {
            System.out.println("無効な月です。");
        }
    }
}
