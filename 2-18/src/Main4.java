import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int[] amounts = {1, 2, 3};
        System.out.println("価格配列: ");
        System.out.println(Arrays.toString(prices));
        System.out.println("\n数量配列: ");
        System.out.println(Arrays.toString(amounts));
        Integer[] totalPrices = calculateTotals(prices, amounts);
        System.out.println("\n合計金額配列(税込み): ");
        System.out.println(Arrays.toString(totalPrices));
    }
    private static Integer[] calculateTotals(int[] prices, int[] amounts) {
        Integer[] totals = new Integer[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int total = prices[i] * amounts[i];
            int tax = (int) (total * 0.1); // 10% tax
            totals[i] = (Integer)(total + tax);
        }
        return totals;
    }
}
