
package Polymorphism;

public class UsingEmp {
    public static void main(String[] args) {
        Employee[] listemp = new Employee[4];
        listemp[0] = new Emp_Fulltime("SE17", "LQH", "0987654321", 1500, 2);
        listemp[1] = new Emp_Parttime("SE17", "LQT", "0987654321", 24);
        listemp[2] = new Emp_Fulltime("SE17", "NMQ", "0987654321", 1700, 2);
        listemp[3] = new Emp_Parttime("SE17", "VTN", "0987654321", 26);
        
        
        //instanceof la de kiem tra no thuoc class nao
        for (int i = 0; i < listemp.length; i++) {
            if (listemp[i] instanceof Emp_Fulltime)
                listemp[i].viewinfor();
        }
    }
}
