public class Main {

    // Compile-time Polymorphism (Overloading)
    static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }
    }

    // Runtime Polymorphism (Overriding)
    static class Payment {

        public void process(double amount) {
            System.out.println("Processing general payment: ₹" + amount);
        }
    }

    static class UPIPayment extends Payment {

        @Override
        public void process(double amount) {
            System.out.println("Processing instant UPI payment: ₹" + amount);
        }
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Int Add: " + calc.add(10, 20));
        System.out.println("Double Add: " + calc.add(10.5, 20.5));

        // Runtime polymorphism
        Payment p = new UPIPayment();
        p.process(999.0);
    }
}
