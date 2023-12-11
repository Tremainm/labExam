package ie.atu;

import java.util.Scanner;
import java.io.File;
public class StudentApp extends Student {

    public StudentApp(String studentName, int studentNo, int studentAge, String studentAddress) {
        super(studentName, studentNo, studentAge, studentAddress);
    }


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();
        System.out.println("Enter student Name: ");
        student1.setStudentName(scanner.nextLine());
        System.out.println("Enter student ID: ");
        student1.setStudentNo(scanner.nextInt());
        System.out.println("Enter student Age: ");
        student1.setStudentAge(scanner.nextInt());
        System.out.println("Enter student Address: ");
        student1.setStudentAddress(scanner.nextLine());

        student1.toString();







    }
}
