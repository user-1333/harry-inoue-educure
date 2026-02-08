public class Main4 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // 学生の追加テスト
        manager.addStudent("アリス");
        manager.addStudent("ボブ");
        manager.addStudent("チャーリー");
        manager.addStudent(null);
        manager.addStudent("イブ");
        try {
            manager.addStudent("デイブ"); // 追加されない
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        manager.getStudent(2); // チャーリー
        try {
            manager.getStudent(3); // 例外発生
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 学生情報の更新
        System.out.println("学生ID 0: " + manager.getStudent(0));
        manager.updateStudent(0, "フランク");
        System.out.println("学生ID 0 更新後: " + manager.getStudent(0));
        System.out.println("学生ID 1: " + manager.getStudent(1));
        manager.updateStudent(1, "ボビー");
        System.out.println("学生ID 1 更新後: " + manager.getStudent(1));
        try {
            manager.updateStudent(10, "グレース"); // 例外発生
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
