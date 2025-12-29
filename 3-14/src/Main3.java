public class Main3 {
    public static void main(String[] args) {
        RegularEmployee emp = new RegularEmployee("山田太郎", 300000);
        System.out.println("名前: " + emp.getName());
        System.out.println("役職: " + emp.getRole());
        System.out.println("給与: " + emp.calculateSalary() + "円");
        System.out.println("-----------------------");
        PartTimeEmployee partEmp = new PartTimeEmployee("佐藤花子", 1000, 120);
        System.out.println("名前: " + partEmp.getName());
        System.out.println("役職: " + partEmp.getRole());
        System.out.println("給与: " + partEmp.calculateSalary() + "円");
    }
}
