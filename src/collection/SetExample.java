package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // int a =10;
        // Integer a1 = 10;
        // Integer a2 = new Integer(10);
        // // Auto UnBoxing - Assigning Wrapper class value into a data type
        // a = a1;
        
        // //Auto boxing - assigning data type to wrapper class
        // a1 = a;

        Set<String> set = new HashSet<String>();
        set.add("xyz");
        set.add("abc");
        set.add("PQR");
        set.add(null);
        set.add("PQR"); // can add duplicates
        //System.out.println(set);
        Set<Employee> employees = new HashSet<>();
                
        // employees.add(new Employee(101, "Allen", 234f, "NY"));
        // employees.add(new Employee(101, "Allen", 234f, "NY"));
        // System.out.println(set);
        // System.out.println("Set size:" + employees.size());

        Employee e1 = new Employee(101, "Allen", 234f, "NY");
        Employee e2 = new Employee(101, "Allen", 234f, "NY");

        employees.add(e1);
        employees.add(e2);
        System.out.println(employees);

        System.out.println(e1.hashCode() + "," + e2.hashCode());
        
        System.out.println("====================");
        System.out.println("LinkedHashSet:");
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("xyz");
        linkedSet.add("abc");
        linkedSet.add("pqr");
        linkedSet.add(null);
        linkedSet.add("pqr");
        System.out.println(linkedSet);

        // System.out.println("====================");
        // System.out.println("TreeSet:");
        // Set<String> treeSet = new TreeSet<>();
        // treeSet.add("xyz");
        // treeSet.add("abc");
        // treeSet.add("pqr");
        // //linkedSet.add(null);    // this would throw a NullPointerException
        // treeSet.add("pqr");
        // System.out.println(treeSet);
        
        System.out.println("====================");
        Set<Employee> treeSet = new TreeSet<>(new NameComparator());    //if we don't pass a comparator, we would get Exception in thread "main" java.lang.ClassCastException: class collection.Employee cannot be cast to class java.lang.Comparable (collection.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        treeSet.add(new Employee(101, "Irfan", 674f, "NJ"));
        treeSet.add(new Employee(101, "Upsana", 8754f, "WA"));
        treeSet.add(new Employee(101, "Niaz", 300f, "NY"));
        System.out.println(treeSet);
    



    }
}
