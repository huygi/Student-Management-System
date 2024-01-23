import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
    
        // Ask users how many new students we want to add 
        System.out.print("Please enter number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create numbers of new students 
        for( int i = 0; i < numOfStudents; i++ ) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for( int i = 0; i < numOfStudents; i++ ) {
            System.out.print(students[i].toString());
            System.out.println();
            System.out.println("-".repeat(28));
        }
    }
    
}

