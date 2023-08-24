package application;

import entities.Student;
import entities.Instructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of instructor: ");
        String instructorName = sc.nextLine();
        System.out.print("Enter the code of instructor: ");
        int instructorCode = sc.nextInt();
        Instructor instructor = new Instructor(instructorName,instructorCode);

        System.out.println("\nThis instructor have the following courses: ");

//        System.out.print("How many students for course A? ");
//        int numberOfStudents = sc.nextInt();
//        for (int i = 0; i < numberOfStudents; i++) {
//            Student student1 = sc.nextInt();
//        }


    }
}