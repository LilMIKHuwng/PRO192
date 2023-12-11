
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsingEmp {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList();
        Employee e1 = new Employee("SE120", "Hung", 1500);
        Employee e2 = new Employee("SE123", "Quan", 1600);
        Employee e3 = new Employee("SE129", "Nhan", 1500);
        
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        
        Collections.sort(emplist, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2){
                    
            int d = e1.getSalary() - e2.getSalary();
            
            if (d>0) return -1;
            if (d==0) return e1.getCode().compareTo(e2.getCode());
            return 1;
            }
        });
        
        System.out.println(emplist);
    }
}
