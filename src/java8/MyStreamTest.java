package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyStreamTest {
    public static void main(String[] args) {
        
        List<Employee> elist = Arrays.asList(new Employee(101, "Allen", "HR", 1234l, "NY"), new Employee(102, "James", "IT", 674l, "NJ"), new Employee(103, "Black", "HR", 8786l, "Pitts"), new Employee(104, "Max", "IT", 4567l, "NY"));

        //Objective: to sort employee data according to salary
        List <Employee> sortedBySalary = elist.stream().sorted((obj1,obj2) -> obj1.getSalary().compareTo(obj2.getSalary())).collect(Collectors.toList());
        System.out.println(sortedBySalary);
        // comparatory interface and runnable fall under functional interface category 
        // because they have only one abstract method

        //Comparator interface method
        // compare(Object obj1, Object obj2)


        // Creating threads using lambda expression
        Runnable r = () ->{
            for(int i=0; i<10; i++){
                System.out.println(i);
            }
        };
        Thread t = new Thread(r);
        t.start();

        //Return a single employee with name "Allen"
        Employee allen = elist.stream().filter(e -> e.getName().equals("Allen")).findFirst().orElse(null);
        System.out.println(allen.getId()+ ", " + allen.getName()+ ", " + allen.getSalary()+ ", " + allen.getDept()+ ", " + allen.getAddress());

        //Find name of the employees whose salary is greater than 2,000
        List<String> rich = elist.stream().filter(e -> e.getSalary()>2000).map(e1 -> e1.getName()).collect(Collectors.toList());
        System.out.println(rich);

        //Find the addresses of all the employees
        List<String> address = elist.stream().map(e -> e.getAddress()).collect(Collectors.toList());
        System.out.println(address);


        //For the given string, list each character and the character counts eg. J:2, a:4
        String input = "JavaJavaEE";  
        
        //  1. convert String into char array: can use .chars()
        //  2. map each character from the array: can use mapToObj()
        //  3. convert char array into a map: collectors does this by using groupingBy()
        
        Map<Character,Long> map = input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        
    }


}

