import java.util.ArrayList;

public class PartyMember {
    private String name;
    private ArrayList<String> skills;
    PartyMember(String name) {
        this.name = name;
        this.skills = new ArrayList<String>();
    }
    public void addSkill(String skill) {
        skills.add(skill);
    }
    public PartyMember clone() {
        PartyMember cloned = new PartyMember(this.name);
        for (String skill : this.skills) {
            cloned.addSkill(skill);
        }
        return cloned;
    }
    public String toString() {
        return String.format("名前:%s スキル:%s", name, skills.toString());
    }
}
