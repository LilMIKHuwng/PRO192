
package Collections;

import java.util.Comparator;

public class SoftSalary implements Comparator{
    @Override
    public int compare(Object t, Object t1 ){
        Employee e1 = (Employee) t;
        Employee e2 = (Employee) t1;
        
        int d = e1.getSalary() - e2.getSalary();
        
        if (d>0) return -1;
        if (d==0) return e1.getCode().compareTo(e2.getCode());
        return 1;
    }
}
