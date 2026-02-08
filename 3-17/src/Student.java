public class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        if (name.isEmpty() || name.length() > 20) {
            System.out.println("名前は1文字以上20文字以下で指定してください。");
        }
        this.name = name;
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("不正な点数です。0から100の範囲で設定してください。");
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
