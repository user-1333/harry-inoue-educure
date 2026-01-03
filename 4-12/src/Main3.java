import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Character hero = new Character("勇者", 130, 300);
        Character villain = new Character("魔法使い", 250, 250);
        Character sidekick = new Character("戦士", 180, 270);
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.addAll(java.util.Arrays.asList(hero, villain, sidekick));
//        characters.sort((Character o1, Character o2) ->{
//            int power1 = o1.getBattlePower();
//            int power2 = o2.getBattlePower();
//            return Integer.compare(power1, power2);
//        });
        characters.sort(Character::CompareTo);
        for (Character character : characters) {
            System.out.println(character.toString());
        }
    }
}
