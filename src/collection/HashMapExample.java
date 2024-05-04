package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();

        map.put(new Employee(101, "Allen",7854f,"USA"),"1");  //Key-Employee object, Value-string
        map.put(new Employee(101, "James",879f,"UK"),"2");
        map.put(null,null);
        map.put(new Employee(103,"Black",843f,"India"),"3");
        System.out.println("HashMap: " + map);
        System.out.println("==================");



        Hashtable<Employee, String> table = new Hashtable<>();

        table.put(new Employee(101, "Allen",7854f,"USA"),"1");
        table.put(new Employee(101, "James",879f,"UK"),"2");
        //table.put(null,null); null key or value would both cause NullPointerException
        table.put(new Employee(103,"Black",843f,"India"),"3");
        System.out.println("Hashtable: " + table);
        System.out.println("==================");



        Map<Employee,String> tree = new TreeMap<>(new NameComparator());    //will sort by name
        tree.put(new Employee(101, "Allen",7854f,"USA"),"1");
        tree.put(new Employee(101, "James",879f,"UK"),"2");
        //tree.put(null,null);  //null key in tree would cause NullPointerException
        tree.put(new Employee(103,"Black",843f,"India"),"3");
        System.out.println("TreeMap:" + tree);

        Set s = tree.keySet();  //keySet is a method of Map, allows us to convert the TreeMap into a set
        // we need to convert it if we want to call iterator, because iterator is applicable only to Set-implemented classes (because it falls under collections). Map is not a part of collections.
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Employee key = (Employee) itr.next();   //next() returns object type, we're downcasting to employee, as per rules of runtime polymorphism
            String value = tree.get(key);
            System.out.println("Key:" + key + ", Value:" + value);

        }


        System.out.println("==================");
    }
}
