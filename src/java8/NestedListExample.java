package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NestedListExample {
    public static void main(String[] args) {
        List<Customer> customers = CustomerDB.getAllCustomer();

        // find customer mobile number
        List<List<String>> mobileNumbers = customers.stream().map(e->e.getMobileNo()).collect(Collectors.toList());
        System.out.println(mobileNumbers);

        //flatMap()
        List<String> mNo = customers.stream().flatMap(c -> c.getMobileNo().stream()).collect(Collectors.toList());
        System.out.println(mNo);

        List<Integer> numbers = Arrays.asList(1,3,4,5,6,6,7,2);

        // Find the second largest number using Stream API
        int secondLargest = numbers.stream().distinct().sorted((a,b) -> b.compareTo(a)).skip(1).findFirst().orElse(null);
        System.out.println(secondLargest);

        List<String> lists = Arrays.asList("apple","banana","apple","orange","banana","apple");
        List<String> duplicate = lists.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(e1 -> e1.getKey()).collect(Collectors.toList());
        System.out.println(duplicate);
    }
}
