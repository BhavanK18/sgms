import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private int rollNo;
    private String name;
    private int[] marks;
    private int total;
    private double percentage;
    private char grade;
    private double gpa;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        calculateResults();
    }

    private void calculateResults() {
        total = Arrays.stream(marks).sum();
        percentage = total / (double)(marks.length);
        if (percentage >= 90) { grade = 'A'; gpa = 10; }
        else if (percentage >= 75) { grade = 'B'; gpa = 8; }
        else if (percentage >= 60) { grade = 'C'; gpa = 6; }
        else if (percentage >= 40) { grade = 'D'; gpa = 5; }
        else { grade = 'F'; gpa = 0; }
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format(
            "Roll: %d | Name: %s | Total: %d | %%: %.2f | Grade: %c | GPA: %.1f",
            rollNo, name, total, percentage, grade, gpa
        );
    }
}
