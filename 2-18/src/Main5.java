public class Main5 {
    public static void main(String[] args) {
        String input = "Hello World";
//        System.out.println("元の文字列: " + input);
        processString(input);
    }
    private static void processString(String input) {
        String uppercased = input.toUpperCase();
        System.out.println("大文字: " + uppercased);
        System.out.println("文字数: " + input.length());
    }
}
