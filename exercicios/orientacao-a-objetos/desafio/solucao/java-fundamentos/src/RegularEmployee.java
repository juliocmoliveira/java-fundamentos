public class RegularEmployee extends Employee {

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateFinalSalary() {
        return this.getBaseSalary();
    }
}
