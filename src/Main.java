import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> sm.addStudent();
                case 2 -> sm.viewAll();
                case 3 -> sm.searchStudent();
                case 4 -> sm.deleteStudent();
                case 5 -> {
                    sm.saveToFile();
                    System.out.println("Saved & Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
            sc.close();
        }
    }
}
