public class Main2 {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("Hero");
        player.setHp(30);

        System.out.println("使用前:");
        player.displayInfo();

        HealingPotion potion = new HealingPotion();
        potion.heal(player);

        System.out.println("プレイヤーのHP: "+player.getHp());
    }
}
