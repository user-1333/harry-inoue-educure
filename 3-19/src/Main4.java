public class Main4 {
    public static void main(String[] args) {
        System.out.printf("100ドル = %d円%n", ExchangeRate.toJPY("USD", 100));

        ExchangeRate.updateRates(150,160);
        System.out.printf("100ドル = %d円%n", ExchangeRate.toJPY("USD", 100));
        System.out.printf("80ユーロ = %d円%n", ExchangeRate.toJPY("EUR", 80));
    }
}
