public class Main2 {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("Hero");
        player.setHp(30);

        System.out.println("使用前:");
        player.displayInfo();

        int healAmount = 50; // 回復量を50に設定
        player.heal(healAmount);

        System.out.println("プレイヤーのHP: "+player.getHp());
    }
}
