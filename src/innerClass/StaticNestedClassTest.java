package innerClass;

public class StaticNestedClassTest {
    public static void main(String[] args) {
        Outer2.Inner2.test1();
    }
}

class Outer2{
    static void test(){
        System.out.println("inside test");
    }

    static class Inner2{    //static is used so that this is initialized when main is
        public static void test1(){     //can't write non-static methods in static classes.
            System.out.println("inside test1");
            test();
        }
    }
    
}


