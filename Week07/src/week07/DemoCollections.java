
package week07;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Nhan");
        list.add("Hung");
        list.add("Quan");
        Collections.sort(list);
        System.out.println(list);
    }
}
