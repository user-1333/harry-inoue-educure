public class Main1 {
    public static void main(String[] args) {
        int price = 1000; // Price of the item
        int amount = 3;   // Amount of items
        System.out.print("商品価格: " + price);
        System.out.println(", 数量: " + amount);
        int totalPrice = taxCalculator(price, amount);
        System.out.println("合計金額(税込み): " + totalPrice+"円");
    }
    private static int taxCalculator(int price, int amount) {
        int total = price * amount;
        int tax = (int) (total * 0.1); // 10% tax
        return total + tax;
    }
}