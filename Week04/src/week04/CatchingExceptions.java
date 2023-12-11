
package week04;

import java.util.Scanner;

public class CatchingExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int n = 0;
        do {
            try {
                System.out.print("Enter a whole number: ");
                n = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Required integer!");
            }
        } while (check == true || n<10 || n>50);
        
        System.out.println("final n: " + n);
    }
}
