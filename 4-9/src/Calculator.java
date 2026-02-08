public class Calculator {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("10 ÷ 0 = エラー：0で割ることはできません");
        }
        return a / b;
    }
}
