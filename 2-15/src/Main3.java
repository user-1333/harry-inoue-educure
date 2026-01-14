public class Main3 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        String[] days = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        // ここに平均気温を計算するコードを書いてください
        double totalTemperature = 0.0;
        for (int i = 0; i < temperatures.length; i++) {
            totalTemperature += temperatures[i];
            System.out.println(days[i] + ": " + temperatures[i] + "度");
        }
        double averageTemperature = totalTemperature / temperatures.length;
        System.out.printf("平均気温: %.1f度\n", averageTemperature);
    }
}