public class Main1 {
    public static void main(String[] args) {
        var weapon = new Weapon("魔法の剣",50);
        var character = new GameCharacter("剣士アレックス",100,weapon);
        System.out.println(character.getName() + "は" + weapon.getName() + "を装備してる！");
    }
}
