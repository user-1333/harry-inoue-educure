public class StudentManager {
    private final String[] students = new String[5];
    private int count = 0;

    public void addStudent(String name) {
        if (count >= students.length) {
            throw new IllegalArgumentException("Cannot add more students. Maximum capacity reached.");
        }
        students[count] = name;
        count++;
    }

    public String getStudent(int id) {
        if (id < 0 || id >= students.length || students[id] == null) {
            throw  new IllegalArgumentException("Invalid student ID: " + id);
        }
        return students[id];
    }

    public void updateStudent(int id, String name) {
        if (id < 0 || id >= students.length) {
            throw new IllegalArgumentException("Invalid student ID: " + id);
        }
        students[id] = name;
    }
}
