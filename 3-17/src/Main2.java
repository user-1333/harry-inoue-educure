public class Main2 {
    public static void main(String[] args) {
        Student student = new Student("山田太郎", 85);
        System.out.println("名前: " + student.getName());
        System.out.println("点数: " + student.getScore());

        Student student2 = new Student("", 110); // 不正な名前のケース
        student2.setName("佐藤花子");
        student2.setScore(95);
        System.out.println("名前: " + student2.getName());
        System.out.println("点数: " + student2.getScore());

        Student student3 = new Student("花山手東", 110); // 不正な点数のケース
        System.out.println("名前: " + student3.getName());
        System.out.println("点数: " + student3.getScore());
    }
}
