public class GameCharacter {
    private String name;
    private int health;
    private Weapon weapon;
    public GameCharacter(String name, int health ,Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
