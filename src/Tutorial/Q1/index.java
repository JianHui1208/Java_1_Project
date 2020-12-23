package Tutorial.Q1;

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        String StuName, StuID, StuPhoNumber;
        Scanner input = new Scanner(System.in);
        student[] S1 = new student[2];

        subject Sub1 = new subject("PROG2214", "Advanced Java Programming", 4);
        subject Sub2 = new subject("PROG1133", "Multimedia Development", 3);
        subject Sub3 = new subject("PROG1010", "Moral Education", 3);
        subject Sub4 = new subject("PROG1045", "Project I", 5);

        subject[] SubArray1 = { Sub1, Sub2 };
        subject[] SubArray2 = { Sub1, Sub3, Sub4 };

        System.out.println("Student Enrolled");
        for (int i = 0; i < S1.length; i++) {
            System.out.print("Enter student name: ");
            StuName = input.next();
            System.out.print("Enter student id: ");
            StuID = input.next();
            System.out.print("Enter phone number: ");
            StuPhoNumber = input.next();
            S1[i] = new student(StuName, StuID, StuPhoNumber);
            System.out.println();
        }

        S1[0].setStuSubject(SubArray1);
        S1[1].setStuSubject(SubArray2);

        for (int i = 0; i < S1.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            S1[i].DisplayStudent();
        }

        System.out.println("Total numbers of students registered = " + student.getCountStudents());
    }
}
