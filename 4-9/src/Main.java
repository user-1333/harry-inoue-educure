public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            // TODO: 10 ÷ 0 を計算
            int result = calc.divide(10, 0);
            System.out.println("10 ÷ 0 = " + result);
        } catch (ArithmeticException e) {
            // TODO: エラーメッセージを表示
            System.out.println("10 ÷ 0 = エラー：" + "0で割ることはできません");
        }
    }
}