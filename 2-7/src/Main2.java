public class Main2 {
    public static void main(String[] args) {
        int price = 2500;
        System.out.println("元の金額は" + price);
        double discount = 0.2;
        int discountAmount = (int) (price * discount);
        System.out.println("割引金額は" + discountAmount);
        int discountedPrice = price - discountAmount;
        System.out.println("販売価格の金額は" + discountedPrice);
    }
}
