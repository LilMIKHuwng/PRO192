
package StudentFPT;

public class UsingStudent {
    public static void main(String[] args) {
        
        Student[] listst = new Student[4];
        listst[0] = new Student("SE171422", "BTD", "43646", "SE", 9.0f);
        listst[1] = new Student("SE171444", "NMQ", "43646", "SE", 3.0f);
        listst[2] = new Student("SE171445", "LQH", "43646", "SE", 2.0f);
        listst[3] = new Student("SE171446", "KUD", "43646", "SE", 7.0f);
        
        for (int i=0; i<listst.length; i++){
            if (listst[i].getGpa()>=7)
            listst[i].viewfor();
        }
    }
}
