public class Student {
    private final String name;
    private int score;

    Student(String name, int score) {
        if (name.isEmpty() || name.length() > 20) {
            throw new IllegalArgumentException("名前は1文字以上20文字以下で指定してください。");
        }
        this.name = name;
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("不正な点数です。0から100の範囲で設定してください。");
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }
}
