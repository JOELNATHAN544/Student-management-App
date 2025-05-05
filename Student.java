import java.util.Arrays;

public class Student extends Person {
    protected String studentId;
    protected int[] grades;

    public Student(String name, int age, String studentId, int[] grades) {
        super(name, age);
        this.studentId = studentId;
        this.grades = grades;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", ID: " + studentId);
        System.out.println("Grades: " + Arrays.toString(grades));
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", ID=" + studentId + "}";
    }
}
