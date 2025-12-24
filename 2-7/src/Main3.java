public class Main3 {
    public static void main(String[] args) {
        int playerAttack = 15;
        int monsterDefense = 5;
        int damage = (playerAttack * 2 - monsterDefense) / 3;
        System.out.println("与えたダメージは" + damage);
    }
}
