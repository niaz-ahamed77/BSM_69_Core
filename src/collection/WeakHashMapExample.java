package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {    // allows us to use sleep
        //Map<Employee, String> weakmap = new WeakHashMap<>();
        Map<Employee, String> weakmap = new HashMap<>();
        Employee e = new Employee(101,"Allen", 789f,"NJ");
        weakmap.put(e,"Hello");
        e = null;
        System.out.println("Weakmap: " + weakmap);
        System.gc();
        Thread.sleep(5000);
        System.out.println("Weakmap after gc() called: " + weakmap);
    }

}
