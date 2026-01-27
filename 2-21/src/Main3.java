import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        Date d = new Date();
        printDate(d);
    }
    static void printDate(Date d){
        System.out.printf("現在の日時：%s",d);
    }
}
