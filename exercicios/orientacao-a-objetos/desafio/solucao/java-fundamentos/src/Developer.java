public class Developer extends Employee implements BonusEligible {

    private int projectCount;

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateFinalSalary() {
        return getBaseSalary() + calculateBonus();
    }

    @Override
    public double calculateBonus() {
        return 300 * projectCount;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }
}
