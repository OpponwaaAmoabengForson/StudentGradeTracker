import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Add a grade
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Calculate average
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    // Highest grade
    public int getHighestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        int highest = grades.get(0);

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    // Lowest grade
    public int getLowestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        int lowest = grades.get(0);

        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }

    // Get student's name
    public String getName() {
        return name;
    }

    // Display report
    public void displayReport() {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.printf("Average: %.2f%n", getAverage());
        System.out.println("Highest Grade: " + getHighestGrade());
        System.out.println("Lowest Grade: " + getLowestGrade());
    }
}