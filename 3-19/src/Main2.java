public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "山田太郎");
        Student student2 = new Student(1001, "山田花子");
        Student student3 = new Student(1002, "鈴木次郎");

        if (student1.equals(student2)) {
            System.out.println("同一の学生です。");
        } else {
            System.out.println("異なる学生です。");
        }
        if (student1.equals(student3)) {
            System.out.println("同一の学生です。");
        } else {
            System.out.println("異なる学生です。");
        }
    }
}
