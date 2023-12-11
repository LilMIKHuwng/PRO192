
package DemoCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("S4", "Nguyen Van Teo", 22);
        Employee e2 = new Employee("S1", "Nguyen Van Ti", 20);
        Employee e3 = new Employee("S6", "Nguyen Thi No", 23);
        Employee e4 = new Employee("S2", "Nguyen Thi Le", 24);
        
        TreeSet list = new TreeSet();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
