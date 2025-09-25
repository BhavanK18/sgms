import java.io.*;
import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    private final String FILE_NAME = "students.dat";

    public StudentManager() {
        loadFromFile();
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Marks in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        students.add(new Student(roll, name, marks));
        System.out.println("Student added!");
    }

    public void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        students.forEach(System.out::println);
    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        students.stream()
                .filter(s -> s.getRollNo() == roll)
                .findFirst()
                .ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Student not found.")
                );
    }

    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt();
        boolean removed = students.removeIf(s -> s.getRollNo() == roll);
        System.out.println(removed ? "Deleted successfully." : "No such record.");
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) { e.printStackTrace(); }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File f = new File(FILE_NAME);
        if (!f.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            students = (List<Student>) ois.readObject();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
