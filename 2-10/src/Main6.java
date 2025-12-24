public class Main6 {
    public static void main(String[] args) {
        String[] days = {"月", "火", "水", "木", "金", "土", "日", "祝"};
        for (String day : days) {
            String subject = timeTable(day);
            System.out.println(day + "曜日の授業は: " + subject);
        }
    }
    private static String timeTable(String day) {
        switch (day) {
            case "月":
                return "数学";
            case "火":
                return "英語";
            case "水":
                return "理科";
            case "木":
                return "社会";
            case "金":
                return "体育";
            case "土":
            case "日":
                return "休み";
            default:
                return "無効な曜日です。";
        }
    }
}
