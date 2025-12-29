public class PartTimeEmployee extends  Employee {
    private final int hourlyWage;
    private final int hoursWorked;

    public PartTimeEmployee(String name, int hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getRole() {
        String role = "アルバイト";
        return super.getRole(role);
    }

    @Override
    public int calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}
