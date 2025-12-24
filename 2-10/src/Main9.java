public class Main9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String op = "/";
        String result = calculate(a, b, op);
        System.out.println("計算結果: " + result);
    }
    private static String calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return String.valueOf(a + b);
            case "-":
                return String.valueOf(a - b);
            case "*":
                return String.valueOf(a * b);
            case "/":
                if (b == 0) {
                    return "0で割ることはできません。";
                }
                return String.valueOf(a / b);
            default:
                return "無効な演算子です。";
        }
    }
}
