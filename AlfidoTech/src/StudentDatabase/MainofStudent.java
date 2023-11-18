package StudentDatabase;

import java.util.Scanner;

public class MainofStudent 
{
    public static void main(String[] args) 
    {
        
    	StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Student Management System\n");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course to Student");
            System.out.println("3. Display Student Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    sms.addStudent(studentId, name);
                    break;
                
                case 2:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter the course: ");
                    String course = scanner.nextLine();
                    sms.addCourseToStudent(id, course);
                    break;
                
                case 3:
                    System.out.print("Enter Student ID: ");
                    String sId = scanner.nextLine();
                    sms.displayStudentInfo(sId);
                    break;
                
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ..");
            }
        }
    }
}
