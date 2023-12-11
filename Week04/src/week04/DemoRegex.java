
package week04;

import java.util.Scanner;
    //Ví dụ Username có độ dài từ 6 đến 12 ký tự
    //Không có khoảng trắng và dấu :
public class DemoRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter User Name: ");
        String username = sc.nextLine();
        
        if (username.matches("[a-z0-9_-]{6,12}$")){
            System.out.println("Valid");
        }
        else
            System.out.println("Invalid");
    }
}
