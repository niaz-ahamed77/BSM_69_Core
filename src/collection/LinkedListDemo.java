package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        List linkedList = new LinkedList();

        linkedList.add("100.5");
        linkedList.add("Hello");
        linkedList.add("100");
        linkedList.add("null");
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);


        // Using IdComparator
        // List<String> linkedList1 = new LinkedList<String>();
        // List<Employee> elist = new LinkedList<Employee>();
        // elist.add(new Employee(101, "James", 7805f, "NY"));
        // elist.add(new Employee(102, "Alack", 467f, "Pitts"));
        // Collections.sort(elist, new IdComparator());         // (arrayList object, class object like IdComparator/NameComparator)
        // System.out.println(elist);
        System.out.println("=============================");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList.contains(100));
        System.out.println(linkedList.indexOf("Hello"));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());

        Collections.synchronizedList(linkedList);

        System.out.println("=============================");
        List<Employee> elist = new LinkedList<Employee>();
        elist.add(new Employee(101,"James", 7805f,"NY"));
        elist.add(new Employee(102, "Black", 4678f, "NJ"));
        Collections.sort(elist, new IdComparator());
        System.out.println("=============================");

        Iterator itr = linkedList.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(linkedList);
        System.out.println("=============================");

        ListIterator listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.nextIndex());
        System.out.println(listIterator.previousIndex());
        System.out.println(listIterator.previous());


    }
    



}
