public class Main {

    // Blueprint class definition
    static class Student {
        String name;
        int rollNo;

        // Constructor to initialize state
        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        public void displayDetails() {
            System.out.println("Student: " + name + " | Roll No: " + rollNo);
        }
    }

    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student("Ketan Das", 101);
        Student s2 = new Student("Aman Sharma", 102);

        s1.displayDetails();
        s2.displayDetails();
    }
}
