public class Main5 {
    public static void main(String[] args) {
        int amountPaid = 2000;
        int notePrice = 280*3;
        int pencilPrice = 120*5;
        int eraserPrice = 100*2;
        int totalPrice = notePrice + pencilPrice + eraserPrice;
        int tax = (int) (totalPrice * 0.1);
        int finalPrice = totalPrice + tax;
        int change = amountPaid - finalPrice;
        System.out.println("小計:" + totalPrice);
        System.out.println("消費税:" + tax);
        System.out.println("合計金額:" + finalPrice);
        System.out.println("おつり:" + change);
    }
}
