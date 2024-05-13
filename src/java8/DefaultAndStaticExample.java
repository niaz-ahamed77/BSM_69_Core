package java8;

@FunctionalInterface
interface A {
    void test();

    default void test1(){
        System.out.println("default test1");
    }

    static void test2(){
        System.out.println("static test2");
    }
}

class I1 implements A{
    @Override
    public void test(){

    }
    @Override
    public void test1(){
        System.out.println("default test1");
    }

    @Override 
    static void test2(){  // CTE because static method cannot be overriden
        System.out.println("static test2");
    }
}

class I2 implements A{
    @Override
    public void test(){

    }
}

public class DefaultAndStaticExample {
    
}


