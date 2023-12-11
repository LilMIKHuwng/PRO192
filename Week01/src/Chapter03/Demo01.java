
package Chapter03;

import java.util.Scanner;


public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.nextLine: trả về toàn bộ dữ liệu kiểu chuỗi
        System.out.print("Nhập fullname: ");
        String fullname = sc.nextLine().toUpperCase();

        System.out.print("Nhập phonenumber: ");
        String Phone = sc.nextLine();

        System.out.print("Nhập age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập Address: ");
        String address = sc.nextLine().toUpperCase();

        System.out.println("---------------------");
        System.out.println(fullname+"-"+Phone+"-"+age+"-"+address);
    }
}
