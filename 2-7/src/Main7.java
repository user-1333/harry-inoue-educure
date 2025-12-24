public class Main7 {
    public static void main(String[] args) {
        int initHP = 100;
        int currentHP = --initHP;
        System.out.println("攻撃一回目：" + "残り体力" + currentHP);
        int currentHP2 = --currentHP;
        System.out.println("攻撃二回目：" + "残り体力" + currentHP2);
        int currentHP3 = --currentHP2;
        System.out.println("攻撃三回目：" + "残り体力" + currentHP3);
    }
}
