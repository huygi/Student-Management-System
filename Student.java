import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentID;
    private String courses = null;
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

        System.out.print( firstName + " " + lastName + " " + gradeLevel + " " + studentID);

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
            System.out.print(" \nPlease enter course to enroll (Q to quit): " );
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();

            if( !course.equals("Q") ) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while( !flag );
        
        System.out.println("ENROLLED IN: " + courses );
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }




    // View balance

    // Pay Tuition 

    // Show status 



}