public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bahriye", 2000.0, 45, 1985);
        e1.tax();
        e1.raiseSalary();
        e1.bonus();

        e1.print();
    }
}