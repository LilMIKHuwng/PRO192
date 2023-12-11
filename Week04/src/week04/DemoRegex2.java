
package week04;

import java.util.Scanner;

public class DemoRegex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter User Name: ");
        String username = sc.nextLine();
        
        if (username.matches("^SE\\d{6}$")){
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");
    }
}

