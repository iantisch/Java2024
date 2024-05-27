package task_9_3_1;

public class ExpensesClient {

    public static void main(String[] args) {
        SalesTeam supermarket = new SalesTeam();

        Manager manager = new Manager(getRandomName(), getRandomManagerSalary());
        supermarket.addEmployee(manager);

        for (int i = 0; i < 3; i++) {
            int numSalespersons = (int) (Math.random() * 3) + 3;
            Employee department = createDepartment(numSalespersons);
            supermarket.addEmployee(department);
        }

        payTeam(supermarket);
    }

    private static String getRandomName() {
        String[] names = {"Олексій", "Анна", "Іван", "Ольга", "Михайло", "Наталія", "Володимир", "Марія", "Ігор", "Тетяна"};
        return names[(int) (Math.random() * names.length)];
    }

    private static int getRandomManagerSalary() {
        return (int) (Math.random() * 2000) + 4000;
    }

    private static int getRandomSalespersonSalary() {
        return (int) (Math.random() * 1000) + 400;
    }

    private static Employee createDepartment(int numSalespersons) {
        Manager manager = new Manager(getRandomName(), getRandomManagerSalary());
        SalesTeam team = new SalesTeam();
        team.addEmployee(manager);
        for (int i = 0; i < numSalespersons; i++) {
            Salesperson salesperson = new Salesperson(getRandomName(), getRandomSalespersonSalary(), manager);
            team.addEmployee(salesperson);
        }
        return team;
    }

    private static void payTeam(SalesTeam team) {
        System.out.println("Видача зарплати");
        team.payExpenses();
        System.out.println("Зарплата видана\n");
    }

}
