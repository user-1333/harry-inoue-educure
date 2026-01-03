public class Main1 {
    public static void main(String[] args) {
        GameItem sword = new GameItem("ドラゴンソード", 1500);
        GameItem shield = new GameItem("エルフの盾", 1200);
        System.out.println("=== ゲームアイテム情報 ===");
        System.out.println(sword.toString());
        System.out.println(shield.toString());
    }
}