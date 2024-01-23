import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;           // static variable 

    // Constructor: prompt user to enter student's name and year 
    public Student() {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Please enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("""
                1 - Freshmen 
                2 - Sophmore
                3 - Junior 
                4 - Senior 
                Please enter student grade level: """ );
        this.gradeLevel = scanner.nextInt();

        setStudentID();

    }

    // Generate student ID
    private void setStudentID() {
        // Grade Level + ID 
        id++;
        this.studentID = gradeLevel + "-" + id;
    }

    // Enroll in courses 
    public void enroll() { 
        boolean flag = false;
        do {
            System.out.print("Please enter course to enroll (Q to quit): " );
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();

            if( !course.equals("Q") ) {                                        // Sometimes course == Q is hard to identify
                courses = courses + "\n   -" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while( !flag );
        
        System.out.println("YOUR TUITION: $" + tuitionBalance);
        System.out.println("-".repeat(35));
    }

    // View balance
    public void viewBalance() {
        System.out.print("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition 
    public void payTuition() {
        System.out.print("Please enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
        System.out.println();
        System.out.println("-".repeat(35));

    }


    // Show status 
    public String toString() { 
        return "\nStudent Name: " + firstName + " " + lastName + 
               "\nGrade Level: " + gradeLevel +
               "\nStudent ID: " + studentID +
               "\nCourses Enrolled:" + courses + 
               "\nBalance: $" + tuitionBalance;
    }



}