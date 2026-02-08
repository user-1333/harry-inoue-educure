import java.util.ArrayList;

public class PartyMember implements Cloneable {
    private final String name;
    private ArrayList<String> skills;

    PartyMember(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public PartyMember clone() {
        try {
            PartyMember cloned = (PartyMember) super.clone();
            cloned.skills = new ArrayList<>(this.skills);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return String.format("名前:%s スキル:%s", name, skills);
    }
}
