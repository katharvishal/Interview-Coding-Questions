public class StudentManagement {
    // Data members
    String name;
    int rollNo;
    double marks;

    // Parameterized constructor
    public StudentManagement(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        StudentManagement student1 = new StudentManagement("Vishal", 101, 85.5);

        student1.displayStudent();
    }     
}
