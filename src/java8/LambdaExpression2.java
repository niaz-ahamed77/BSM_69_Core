package java8;

@FunctionalInterface
interface MyI2{

    void test(String str);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        MyI2 a=(str)-> System.err.println("lambda expression a: " + str);
        a.test("Hello");

        MyI2 b=(str)-> {
            System.err.println("It's a lambda expression b, part 1: " + str);
            System.out.println("It's a lambda expression b, part 2");
        };
        b.test("Welcome");
    }
}



