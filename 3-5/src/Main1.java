public class Main1 {
    public static void main(String[] args) {
        var weapon = new Weapon();
        weapon.setName("魔法の剣");
        var character = new GameCharacter();
        character.setName("剣士アレックス");
        System.out.println(character.getName() + "は" + weapon.getName() + "を装備してる！");
    }
}
