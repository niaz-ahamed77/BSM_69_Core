package java8;

@FunctionalInterface
interface MyI{

    void test();
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        MyI a=()-> System.err.println("It's a lambda expression a");
        a.test();

        MyI b=()-> {
            System.err.println("It's a lambda expression b, part 1");
            System.out.println("It's a lambda expression b, part 2");
        };
        b.test();
    }
}


