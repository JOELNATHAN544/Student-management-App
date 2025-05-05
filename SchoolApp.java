import java.util.ArrayList;
import java.util.Scanner;

public class SchoolApp {
    private static ArrayList<Person> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addGraduateStudent();
                case 3 -> displayAll();
                case 4 -> {
                    System.out.println("Exiting...");
                    running = false;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        int[] grades = inputGrades();

        students.add(new Student(name, age, id, grades));
        System.out.println("Student added.");
    }

    private static void addGraduateStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        int[] grades = inputGrades();

        System.out.print("Enter thesis title: ");
        String thesis = scanner.nextLine();

        System.out.print("Enter advisor name: ");
        String advisor = scanner.nextLine();

        students.add(new GraduateStudent(name, age, id, grades, thesis, advisor));
        System.out.println("Graduate student added.");
    }

    private static int[] inputGrades() {
        System.out.print("Enter number of grades: ");
        int count = scanner.nextInt();
        int[] grades = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        scanner.nextLine(); // consume newline
        return grades;
    }

    private static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Person p : students) {
                p.displayInfo();
                System.out.println("----------------------");
            }
        }
    }
}
