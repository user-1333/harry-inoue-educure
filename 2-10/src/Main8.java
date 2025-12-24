public class Main8 {
    public static void main(String[] args) {
        System.out.println(getScoreGrade(95)); // A
        System.out.println(getScoreGrade(82)); // B
        System.out.println(getScoreGrade(76)); // C
        System.out.println(getScoreGrade(64)); // D
        System.out.println(getScoreGrade(50)); // F
        System.out.println(getScoreGrade(-10)); // F
    }
private static String getScoreGrade(int score) {
        int tens = score / 10;
        switch (tens) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
