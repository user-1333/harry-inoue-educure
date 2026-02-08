public class GameCharacter {
    private String name;
    private int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

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
    public void showStatus() {
        System.out.println("名前：" + this.getName() + "\nHP：" + this.getHp());
    }
}
