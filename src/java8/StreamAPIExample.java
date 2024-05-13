package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        
        // Assume we have the objective to count emptry strings 

        //Using Java7
        int result = getCountEmptyStringUsingJava7(strings);
        System.out.println("Java 7 empty strings in list: " + result);

        //Using Java8 Stream API
        Stream <String> s = strings.stream();    // converts list into stream
        s = s.filter(string -> string.isEmpty()); // filter() is a predicate
        long count1 = s.count();
        System.out.println("Java 8: " + count1);

        //Using Java8 Stream API with 1 line
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Java 8 one-liner: " + count);

        // List if String, display all strings with hello prefix
        List<String> msg = strings.stream().map(string -> "Hello" + string).collect(Collectors.toList());  
        System.out.println(msg);

        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        // Objective: To find square of every element from the list using stream
        List<Integer> square = integers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(square); //prints as a list

        integers.stream().map(i -> i * i).distinct().forEach((e) -> System.out.println(e));
        // For each distinct squared integer, println

        //max,min,average,sum
        
        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

        int max = stats.getMax();
        double average = stats.getAverage();
        int min = stats.getMin();
        long sum = stats.getSum();
        System.out.println(max + ", " + min + ", " + average + ", " + sum);

    }

    private static int getCountEmptyStringUsingJava7(List<String> strings){
        int count = 0;
        for (String string : strings){
            if (string.isEmpty()){
                count++;
            }
        }
        return count;
    }


}
