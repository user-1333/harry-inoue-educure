public class Character {
    private String name;
    private int attack;
    private int hp;
    
    public Character(String name, int attackPower, int hp) {
        this.name = name;
        this.attack = attackPower;
        this.hp = hp;
    }
    public int getBattlePower() {
        return attack + hp;
    }
    public String toString() {
        return String.format("名前:%s(HP: %d 攻撃力: %d) 戦闘力: %d", name, attack, hp, getBattlePower());
    }
    public int CompareTo(Character character) {
        int thisPower = this.attack + this.hp;
        int otherPower = character.attack + character.hp;
        if (thisPower > otherPower) {
            return -1;
        } else if (thisPower == otherPower) {
            return 0;
        } else {
            return 1;
        }
    }
}
