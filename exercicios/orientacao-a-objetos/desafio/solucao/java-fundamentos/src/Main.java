public class Main {
    public static void main(String[] args) {

        Employee regularEmployee = new RegularEmployee("Júlio", 15000);

        Manager manager = new Manager("Peretro", 30000);

        Developer developer = new Developer("Ricardo", 20000);

        manager.setTeamCount(3);

        developer.setProjectCount(3);

        regularEmployee.displayInfo();
        manager.displayInfo();
        developer.displayInfo();
    }
}