public class Monster {
    private final String name;
    private final int level;
    Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Monster other)) {
            throw new IllegalArgumentException("比較対象がモンスターではありません");
        }
        return this.name.equals(other.name) && this.level == other.level;
    }
    @Override
    public String toString() {
        return name + "Lv " + level;
    }
}
