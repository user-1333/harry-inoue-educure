public class StudentManager {
    private final String[] students = new String[5];
    private int count = 0;

    public void addStudent(String name) {
        if (count >= students.length) {
            System.out.println("Cannot add more students. Maximum capacity reached.");
            return;
        }
        students[count] = name;
        count++;
    }

    public String getStudent(int id) {
        if (id < 0 || id >= students.length || students[id] == null) {
            System.out.println("Invalid student ID: " + id);
            return  null;
        }
        return students[id];
    }

    public void updateStudent(int id, String name) {
        if (id < 0 || id >= students.length) {
            System.out.println("Invalid student ID: " + id);
            return;
        }
        students[id] = name;
    }
}
