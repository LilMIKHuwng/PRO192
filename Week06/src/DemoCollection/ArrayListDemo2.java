
package DemoCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        
        //Mặc định mỗi pt trong data type là Object
        List list01 = new ArrayList();//Đa hình
        list01.add("Lan");
        list01.add("Hong");
        list01.add("Mai");
        list01.add("Cuc");
        list01.add("Lan");
        list01.add(10);
        
        list01.set(2, "Trang");
        System.out.println(list01);
    }
}
