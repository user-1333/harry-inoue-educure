public class HealingPotion {
    private Player player;

    public void heal(Player player) {
        int amount = 50; // 回復量を50に設定
        player.setHp(player.getHp()+amount);
        System.out.println("回復ポーションを使用しました。");
    }
}
