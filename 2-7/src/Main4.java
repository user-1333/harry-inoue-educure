public class Main4 {
    public static void main(String[] args) {
        int maxHP = 1000;
        double rateHP = 83.7;
        int currentHP = (int) (maxHP * rateHP / 100);
        System.out.println("現在HP:" + currentHP);
    }
}
