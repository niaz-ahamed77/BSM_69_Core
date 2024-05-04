package collection;

import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMap {
    public static void main(String[] args) {
        
        Map<String,String> coMap = new java.util.concurrent.ConcurrentHashMap<>();
        coMap.put("abc", "Hello"); // Entry: key,value pair
        coMap.put("xyz", "Welcome");
        coMap.put("pqr", "How are you");

        Iterator<String> itr = coMap.keySet().iterator();
        while(itr.hasNext()){   //iterating through coMap
            String key = itr.next();
            if (key.equals("abc")){     
                coMap.put(key, "Bye");  // adding values as we iterate along
            }
        }
        System.out.println("ConcurrentHashMap: " + coMap);
    }
}
