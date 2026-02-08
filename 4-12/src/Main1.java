public class Main1 {
    public static void main(String[] args) {
        GameItem sword = new GameItem("回復薬", 100);
        GameItem shield = new GameItem("魔法の杖", 1500);
        System.out.println("アイテム情報: ");
        System.out.println(sword.toString());
        System.out.println(shield.toString());
    }
}