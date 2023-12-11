
package HCN;

public class Demo {
    public static void main(String[] args) {
        TinhDTHCN r = new TinhDTHCN(2, 5);
        System.out.println("Độ dài "+r.toString());
        System.out.println("DTHCN "+r.area());
        
        TinhDTHHCN b = new TinhDTHHCN(2, 2, 2);
        System.out.println("Độ dài "+b.toString());
        System.out.println("DTHHCN "+b.area());
        System.out.println("TTHHCN "+b.volumn());
    }
}
