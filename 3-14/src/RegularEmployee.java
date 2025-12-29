public class RegularEmployee extends Employee {
    private final int Salary;
    public RegularEmployee(String name, int Salary) {
        super(name);
        this.Salary = Salary;
    }
    @Override
    public String getRole() {
        String role = "正社員";
        return super.getRole(role);
    }

    @Override
    public int calculateSalary() {
        return Salary;
    }
}
