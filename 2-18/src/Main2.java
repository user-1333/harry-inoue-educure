public class Main2 {
    public static void main(String[] args) {
        int score = 85; // Example score
        System.out.println("得点: " + score);
        String grade = greadeCalculator(score);
        System.out.println("評価: " + grade);
    }
    private static String greadeCalculator(int score) {
        if (score >= 80) {
            return "優";
        } else if (score >= 70) {
            return "良";
        } else if (score >= 60) {
            return "可";
        } else {
            return "不可";
        }
    }
}
