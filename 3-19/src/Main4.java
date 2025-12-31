public class Main4 {
    public static void main(String[] args) {
        System.out.println("100ドルは日本円で" + ExchangeRate.toJPY("USD", 100) + "円です。");

        ExchangeRate.updateRates(150,160);
        System.out.println("100ドルは日本円で" + ExchangeRate.toJPY("USD", 100) + "円です。");
        System.out.println("100ユーロは日本円で" + ExchangeRate.toJPY("EUR", 80) + "円です。");
    }
}
