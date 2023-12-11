
package week06;

public class StringBuiderDemo {
    public static void main(String[] args) {
        StringBuilder sB = new StringBuilder("Hello");
        sB.append("Java");
        System.out.println(sB);
        
        sB.delete(1, 3);
        System.out.println(sB);
    }
}
