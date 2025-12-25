public class Player {
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void heal(int amount) {
        this.hp += amount;
        System.out.println("回復ポーションを使用しました。");
    }

    public void displayInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Player HP: " + hp);
    }

}
