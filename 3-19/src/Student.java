import java.util.Objects;

public class Student {
    private int id;      // 学籍番号
    private String name; // 氏名

    // コンストラクタ
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // equals()メソッドをオーバーライド
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // 同じオブジェクトなら同一
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // nullまたはクラスが異なる場合は非同一
        }
        Student student = (Student) obj;
        return id == student.id;  // 学籍番号が同じなら同一
    }

    // hashCode()メソッドをオーバーライド（equals()をオーバーライドした場合、必ずオーバーライドするべき）
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // 学籍番号と氏名を表示するメソッド
    @Override
    public String toString() {
        return "ID: " + id + ", 名前: " + name;
    }
}
