public class Manager extends Employee implements BonusEligible {

    private int teamCount;

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateFinalSalary() {
        return  calculateBonus() + getBaseSalary();
    }

    public double calculateBonus() {
        return 500 * teamCount;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
    }
}
