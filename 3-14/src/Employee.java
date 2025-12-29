public abstract class Employee {
    protected final String name;

    Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getRole(String role){
        return role;
    }

    public abstract String getRole();
    public abstract int calculateSalary();
}
