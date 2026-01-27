public class Main1 {
    public static void main(String[] args) {
        String str = "Hello World";
        stream_str(str);
    }
    static void stream_str(String str){
        System.out.printf("大文字：%s%n", str.toUpperCase());
        System.out.printf("文字数：%d%n", str.length());
    }
}