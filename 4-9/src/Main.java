public class Main {
    public static void main(String[] args) {
        try {
            int result = Calculator.divide(10, 0);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            // 例外オブジェクトからメッセージを取得
            System.out.println(e.getMessage());
        }
    }
}
