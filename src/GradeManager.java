import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    // Constructor
    public GradeManager() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all student reports
    public void displayAllReports() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n========== STUDENT REPORTS ==========");

        for (Student student : students) {
            student.displayReport();
        }
    }
}