public class Character implements Comparable<Character> {
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

    @Override
    public String toString() {
        return String.format(
                "名前:%s(HP: %d 攻撃力: %d) 戦闘力: %d",
                name, hp, attack, getBattlePower()
        );
    }

    @Override
    public int compareTo(Character character) {
        int thisPower = this.getBattlePower();
        int otherPower = character.getBattlePower();
        return Integer.compare(otherPower, thisPower);
    }
}
