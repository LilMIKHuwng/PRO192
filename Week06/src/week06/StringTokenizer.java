
package week06;

public class StringTokenizer {

    public static void main(String[] args) {
        String str = "I study hard. So, I pass the examination";
        String[] strs = str.split("[ ,.]+");
        for (String s: strs) {
            System.out.println(s);
        }
    }
}
