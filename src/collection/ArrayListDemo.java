package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();    
        //Runtime Polymorphism - notice we're not doing Arraylist l = new ArrayList()
        
        //to add an element to an ArrayList, we use the formula: 
        //current capacity*3/2+1
        //10*3/2+1=16

        //we can restrict type as follows:
        List<String> list1 = new ArrayList<String>();

        list.add(123);
        list.add(123);
        list.add(null);
        list.add("Hello");
        list.add(345.8);

        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.remove(1));

        System.out.println(list);
        System.out.println(list.contains("Hello"));
        System.out.println(list.size());


        Collections.synchronizedList(list); // makes our arraylist thread-safe
        // System.out.println("==========================");

        // Iterator iterator = list.iterator();

        // while(iterator.hasNext()){  //hasNext checks current index for a value (returns True if yes)
        //     System.out.println(iterator.next());    //next() returns the value of the current index
        //     iterator.remove();
        // }

        // System.out.println(list);
        // System.out.println("==========================");

        //ListIterator
        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("==========================");
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.nextIndex());
        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.previous());
        //int arr[] = {9,8,7,6,5,4,3,2,1};
    }
}
