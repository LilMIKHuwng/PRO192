package week06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

    public static void main(String[] args) {
        Date cr = new Date();
        System.out.println("Today: " + cr);
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String today = sf.format(cr);
        System.out.println("Today After Proccessing: " + today);
    }
}
