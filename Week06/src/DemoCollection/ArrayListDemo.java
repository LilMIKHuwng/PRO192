
package DemoCollection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list01 = new ArrayList();
        list01.add("Lan");
        list01.add("Hong");
        list01.add("Mai");
        list01.add("Cuc");
        list01.add("Lan");
        
        for (int i = 0; i < list01.size(); i++) {
            System.out.println(list01.get(i));
        }
        
//        for (Object pt : list01){
//            System.out.println(pt);
//        }
        
        list01.remove("Hong");
        
        System.out.println(list01);
        
        if (list01.contains("Cuc"))
            System.out.println("Chieu nay di an kem em nhe");
        else 
            System.out.println("Di an kem 1 minh");
    }
}
