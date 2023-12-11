
package week06;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sB = new StringBuffer("01234567");
        System.out.println(sB);
        sB.append("ABC");
        System.out.println(sB);
        sB.insert(2, "FAT PERSON");
        System.out.println(sB);
        sB.reverse();
        System.out.println(sB);
    }
}
