import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        System.out.println("===== STUDENT GRADE TRACKER =====");

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Reports");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    Student student = new Student(name);

                    System.out.print("How many grades? ");
                    int numberOfGrades = scanner.nextInt();

                    for (int i = 1; i <= numberOfGrades; i++) {
                        System.out.print("Enter grade " + i + ": ");
                        int grade = scanner.nextInt();
                        student.addGrade(grade);
                    }

                    manager.addStudent(student);

                    System.out.println("Student added successfully!");
                    break;

                case 2:

                    manager.displayAllReports();
                    break;

                case 3:

                    System.out.println("Thank you for using Student Grade Tracker!");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}