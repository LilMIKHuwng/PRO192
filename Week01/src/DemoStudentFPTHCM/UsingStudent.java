package DemoStudentFPTHCM;

import java.util.Scanner;

public class UsingStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] listst = new Student[n];
        String code, fullname, birthday, major;
        float gpa;
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Enter code: ");
            code = sc.nextLine();
            System.out.print("Enter fullname: ");
            fullname = sc.nextLine();
            System.out.print("Enter birthday: ");
            birthday = sc.nextLine();
            System.out.print("Enter major: ");
            major = sc.nextLine();
            System.out.print("Enter gpa: ");
            gpa = Float.parseFloat(sc.nextLine());

            listst[i] = new Student(code, fullname, birthday, major, gpa);
        }

        for (int i = 0; i < n; i++) {
            if (listst[i].getGpa() >= 7) {
                listst[i].viewfor();
            }
        }
    }
}
