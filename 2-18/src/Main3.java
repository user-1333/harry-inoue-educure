public class Main3 {
    public static void main(String[] args) {
        String original = "\"Hello\"";
        System.out.println("元の文字列: " + original);
        String reversed = reverseStr(original);
        System.out.println("逆順の文字列: " + reversed);
    }
    private static String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
