package java8;

@FunctionalInterface
interface MyI3{
    String test(String s1, String s2);  //multiple parameters
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        MyI3 a = (str, str1) -> str + ", " + str1;
        System.out.println(a.test("Hello", "How are you?"));

        MyI3 b = (str, str1) -> {return str + ", " + str1;};    //if we use "return", then {} needed
        String result = b.test("Welcome", "Fine");
        System.out.println(result);
    }
}



