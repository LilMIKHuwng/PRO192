
package week06;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc;
        String s = "I love you 4 so much. 34 I 23 want to marry you";
        sc = new Scanner(s);
        sc.useDelimiter("[[ .]\\d]+");
        while(sc.hasNext()){
            String token = sc.next();
            System.out.println(token);
        }            
    }
}
