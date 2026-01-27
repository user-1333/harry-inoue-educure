public class Main1 {
    public static void main(String[] args) {
        String str = "Hello World";
        processString(str);
    }
    static void processString(String str){
        System.out.printf("大文字：%s%n", str.toUpperCase());
        System.out.printf("文字数：%d%n", str.length());
    }
}