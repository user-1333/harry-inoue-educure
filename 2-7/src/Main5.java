public class Main5 {
    public static void main(String[] args) {
        int amountPaid = 2000;
        int notePrice = 280*3;
        int pencilPrice = 120*5;
        int eraserPrice = 100*2;
        int totalPrice = notePrice + pencilPrice + eraserPrice;
        int change = amountPaid - totalPrice;
        int tax = (int) (totalPrice * 0.1);
        int finalPrice = totalPrice + tax;
        System.out.println("小計は" + totalPrice);
        System.out.println("消費税は" + tax);
        System.out.println("税込みの合計金額は" + finalPrice);
        System.out.println("おつりは" + change);
    }
}
