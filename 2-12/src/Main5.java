public class Main5 {
    public static void main(String[] args) {
        int i = 11;
        while (true) {
            i--;
            System.out.println("現在の在庫数: "+i);
            if (i <= 1) {
                System.out.println("在庫がなくなりました。");
                break;
            }
        }
    }
}
