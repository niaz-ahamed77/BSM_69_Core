package java11Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class ToArray {
    public static void main(String[] args) {
        
        //toArray - takes an int parameter and converts list into array
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Allen",90760f));
        emp.add(new Employee(101, "Black", 89706f));

        System.out.println(emp);
        System.out.println("=============");

        Employee[] array = emp.toArray(size -> new Employee[size]); //using lambda expression
        Employee[] arr1 = emp.toArray(Employee[]::new); //using method reference


        System.out.println(array[0]);


        //2. Added var keyword for local variables
        //we can use var in lambda as an argument

        var msg = 100.5;
        System.out.println(msg);

        BiFunction<String,Integer,String> result = (var x, var y) -> {
            System.out.println(x + "," + y);
            return "Hello" + "How";
        };
        
        System.out.println(result.apply("10",20));

        // 3. Added new method in Optional class -- isEmpty()
        Optional<String> value = Optional.ofNullable(null);
        System.out.println(value.isEmpty());
    }
}


