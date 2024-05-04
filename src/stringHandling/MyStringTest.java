package stringHandling;

import java.io.PrintStream;

public class MyStringTest {
    public static void main(String[] args) {
        PrintStream r = System.out;
        r.println("Hello");
        
        //str2, str3 are reference variables, whose values are "Hello"
        String str = "Hello"; //Literal -- JVM stores data in constant pool
        String str1 = "Hello";
        String str2 = new String ("Hello");
        String str3 = new String("Hello");
        System.out.println(str == str1);    //true because str1 was set to "Hello" by using by reference
        System.out.println(str2 == str3);   //false because memory is allocated separately for each object
        //difference between == and equals() method
        System.out.println("===================");

        System.out.println("===================");
        System.out.println(str2.equals(str3));  //true because compares the value, since the String class (predefined) overrides the equals(). Otherwise equals() would work same as ==
        System.out.println(str2 == str3); //false because compares reference

        System.out.println("===================");
        Employee e1 = new Employee("Hello");    //object class of reference method 
        Employee e2 = new Employee("Hello");
        System.out.println(e1.equals(e2));  //false unless we override the equals() in Employee class
        System.out.println(e1 == e2);   //false


        //equals() only compares the reference if the class is not overrided
        //== 
    }
 

    
}
