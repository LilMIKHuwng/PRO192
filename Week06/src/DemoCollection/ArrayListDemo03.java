
package DemoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        List list01 = new ArrayList();//Đa hình
        list01.add("Lan");
        list01.add("Hong");
        list01.add("Mai");
        list01.add("Cuc");
        list01.add("Lan");
        list01.add(10);
        
        Iterator iter = list01.iterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
