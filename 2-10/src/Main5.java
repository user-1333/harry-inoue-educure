import java.awt.*;

public class Main5 {
    public static void main(String[] args) {
        interface selectDrink {
            String chooseDrink(int No);
        }
        selectDrink drink = (int No) -> {
            switch (No) {
                case 1:
                    return "コーヒーを選びました。";
                case 2:
                    return "紅茶を選びました。";
                case 3:
                    return "ジュースを選びました。";
                default:
                    return "無効な選択です。";
            }
        };
        System.out.println(drink.chooseDrink(1));
        System.out.println(drink.chooseDrink(2));
        System.out.println(drink.chooseDrink(3));
        System.out.println(drink.chooseDrink(4));
    }
}
