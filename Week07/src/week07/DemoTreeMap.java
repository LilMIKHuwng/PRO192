
package week07;

import java.util.Iterator;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        String key;
        
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("PY", "Python");
        map.put("P", "PHP");
        
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()){
            key=iter.next();
            System.out.println(key+"=>"+map.get(key));
        }
    }
}
