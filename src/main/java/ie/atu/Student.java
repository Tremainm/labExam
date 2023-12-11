package ie.atu;

import java.util.Scanner;
public class Student {
    Scanner scanner = new Scanner(System.in);
    private String studentName;
    private int studentNo;
    private int studentAge;
    private String studentAddress;

    public Student() {
        this.studentName = "";
        this.studentNo = 0;
        this.studentAge = 0;
        this.studentAddress = "";
    }

    public Student(String studentName, int studentNo, int studentAge, String studentAddress) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNo=" + studentNo +
                ", studentAge=" + studentAge +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    public void getData()
    {
        System.out.println("Enter student name: ");
        studentName = scanner.nextLine();
        System.out.println("Enter student ID: ");
        studentNo = scanner.nextInt();
        System.out.println("Enter student Age: ");
        studentAge = scanner.nextInt();
        System.out.println("Enter student address: ");
        studentAddress = scanner.nextLine();

    }
}
