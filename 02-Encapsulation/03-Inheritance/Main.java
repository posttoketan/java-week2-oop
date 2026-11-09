public class Main {

    // Superclass
    static class Employee {
        protected String name;
        protected double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public void calculateSalary() {
            System.out.println(name + " Total Compensation: ₹" + baseSalary);
        }
    }

    // Subclass extending Employee
    static class SoftwareEngineer extends Employee {
        private double bonus;

        public SoftwareEngineer(String name, double baseSalary, double bonus) {
            super(name, baseSalary);
            this.bonus = bonus;
        }

        @Override
        public void calculateSalary() {
            double total = baseSalary + bonus;
            System.out.println(name + " (Engineer) Total Compensation: ₹" + total);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rajesh", 40000.0);
        SoftwareEngineer eng = new SoftwareEngineer("Ketan", 60000.0, 15000.0);

        emp.calculateSalary();
        eng.calculateSalary();
    }
}
