public class Student {
    // Instance variables
    private String name;
    private int rollNo;
    private double marks;

    // Constructor to initialize using constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // No-argument constructor to provide default values
    public Student() {
        this.name = "Unknown";
        this.rollNo = 0;
        this.marks = 0.0;
    }

    // Method to initialize using method
    public void initializeUsingMethod(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to initialize using reference
    public void initializeUsingReference(Student student) {
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.marks = student.marks;
    }

    // Method to display student information
    public void show() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Initialize using constructor
        Student student1 = new Student("John Doe", 101, 85.5);
        student1.show();

        // Initialize using method
        Student student2 = new Student();
        student2.initializeUsingMethod("Alice Smith", 102, 92.0);
        student2.show();

        // Initialize using reference
        Student student3 = new Student();
        student3.initializeUsingReference(student1);
        student3.show();
    }
}
