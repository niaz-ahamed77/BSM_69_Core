package stringHandling;

public class MyStringTest2 {
    public static void main(String[] args) {
        
        // Strings are immutable
        String str = "Hello";   // new object created
        str = "Yes";    // we can't adjust/change the "Hello", but we can replace.
        String str1 = str.concat("Welcome");    //new object created again
        String str2=str1.concat("Fine");    //new object created once more (since strings can't be changed)
        
        // StringBuffers are mutable
        StringBuffer sb = new StringBuffer("Hello");    // new object stored
        StringBuffer sb1 = sb.append("Welcome");    // no need for new obj because 
        StringBuffer sb2 = sb1.append("Fine");  //

        System.out.println(str + "=" + str1 + "=" + str2);
        System.out.println(sb + "=" + sb1 + "=" + sb2);
    }
}
