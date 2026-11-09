public class Main {

    // Abstract class
    abstract static class Shape {
        abstract double area();
    }

    // Concrete subclass
    static class Rectangle extends Shape {
        private double length;
        private double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Shape shape = new Rectangle(5, 3);

        System.out.println("Area: " + shape.area());
    }
}
