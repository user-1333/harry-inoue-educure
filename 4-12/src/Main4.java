public class Main4 {
    public static void main(String[] args) {
        PartyMember original = new PartyMember("アリス");
        original.addSkill("ファイア");
        original.addSkill("ブリザード");
        PartyMember cloned = original.clone();
        cloned.addSkill("サンダー");
        System.out.println("オリジナル: " + original.toString());
        System.out.println("クローン: " + cloned.toString());
    }
}
