public class Main3 {
    public static void main(String[] args) {
        Employee emp = new RegularEmployee("山田太郎", 300000);
        System.out.printf("%s (%s)の給与：%d円\n", emp.getRole(), emp.getName(), emp.calculateSalary());
        System.out.println("-----------------------");
        Employee partEmp = new PartTimeEmployee("佐藤花子", 1000, 120);
        System.out.printf("%s (%s)の給与：%d円\n", partEmp.getRole(), partEmp.getName(), partEmp.calculateSalary());
    }
}
