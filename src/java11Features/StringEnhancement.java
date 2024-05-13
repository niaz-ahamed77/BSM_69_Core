package java11Features;

import java.util.List;
import java.util.stream.Collectors;

public class StringEnhancement {
    public static void main(String[] args) {
        String str = "Wel\rcome";
        String str1 = "Hel\nlo";
        List<String> result = str.lines().collect(Collectors.toList());
        List<String> result1 = str1.lines().collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result1);

        String name = "     Allen   ";
        System.out.println(name.stripLeading());    //removes leading spaces
        System.out.println(name.stripTrailing());   //remove trailing spaces
        System.out.println(name.strip());   //removes both leading and trailing spaces

        String greeting = "Hello\t";
        System.out.println(greeting.repeat(10));
    }
}


