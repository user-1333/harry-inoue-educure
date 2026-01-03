public class Monster {
    private final String name;
    private final int level;
    Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public boolean equals(Monster m) {
        return this.name.equals(m.name) && this.level == m.level;
    }
    @Override
    public String toString() {
        return name + "Lv " + level;
    }
}
