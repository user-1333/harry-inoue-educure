public class Main4 {
    public static void main(String[] args) {
        PartyMember original = new PartyMember("勇者");
        original.addSkill("ファイヤー");
        original.addSkill("ブリザード");
        PartyMember cloned = original.clone();
        cloned.addSkill("サンダー");
        System.out.println("オリジナル: " + original.toString());
        System.out.println("クローン: " + cloned.toString());
    }
}
