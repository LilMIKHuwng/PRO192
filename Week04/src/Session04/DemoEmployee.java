
package Session04;

public class DemoEmployee {
    public static double TotalSalary(Employee emp[]){
        double total=0;
        for (int i=0;i<emp.length;i++){
            total+=emp[i].getSalary();
        }
        return total;
    }
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        
        emp[0] = new Employee("SE171422", "Hung", 300);
        emp[1] = new Employee("SE171411", "Nhan", 300);
        emp[2] = new Employee("SE171433", "Quan", 300);
        
        double total=DemoEmployee.TotalSalary(emp);
        System.out.println(" Total Salary : "+total);
        
        System.out.println(emp[0]);
        System.out.println(emp[1]);
        System.out.println(emp[2]);
    }
}
