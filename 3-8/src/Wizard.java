public class Wizard extends GameCharacter{
    private int mp;

    Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
    @Override
    public void showStatus() {
        System.out.println("名前：" + super.getName() + "\nHP：" + super.getHp() + "\nMP：" + this.mp);
    }
}
