
package DemoHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap mymap = new HashMap();
        Scanner sc = new Scanner(System.in);
        String nameAni;
        mymap.put("Meo", "Cat");
        mymap.put("Cho", "Dog");
        mymap.put("Gau", "Bear");
        mymap.put("Su tu", "Lion");
        System.out.println("Enter Name Animal: ");
        nameAni = sc.nextLine();
        Iterator iter = mymap.keySet().iterator();
        System.out.println("------------------------");
        while(iter.hasNext()){
            Object key = iter.next();
            if (key.equals(nameAni))
                System.out.println(nameAni + "=>" + mymap.get(key));
        }
    }
}
