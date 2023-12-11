
package week06;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
    static public String customFormat(String pattern, double value){
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        return output;
        
    }
    public static void main(String[] args) {
        System.out.println(customFormat("###,###.###", 123456.789));
        System.out.println(customFormat("###.##", 123456.789));
        System.out.println(customFormat("000000.000", 123.78));
        System.out.println(customFormat("$###,###.###", 12345.67));
    }
}
