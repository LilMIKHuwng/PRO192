
package StudentMNG;


public class UsingStudent {
    public static void main(String[] args) {
        
        Student sv1 = new Student("SE17144", "BTD", "43646", "SE", 9.0f);
        sv1.viewfor();
        
        Student sv2 = new Student("SE171411", "NTN");
        sv2.viewfor();
        
        //Cap nhat gpa cua 2 sv la 3.5
        sv1.setGpa(3.5f);
        sv2.setGpa(3.5f);
        
        sv1.viewfor();
        sv2.viewfor();
        
    }
}
