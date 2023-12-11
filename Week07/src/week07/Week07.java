package week07;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Week07 {

    public static void main(String[] args) {
        Random r = new Random();
        TreeSet myset = new TreeSet();
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            myset.add(number);
        }
            //using Iterator
        Iterator iter = myset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
