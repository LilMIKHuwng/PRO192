
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SoftRandom {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Random rd = new Random();
        while (list.size()<10){
            int random = rd.nextInt(10);
            list.add(random);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
