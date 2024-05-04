package innerClass;

public class MethodLocalInnerClassTest {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.test();
    }
}

class Outer1{
    void test(){
        System.out.println("inside method");
        
        class Inner1{
            void test1(){
                System.out.println();   //we cannot place sout directly in the class, can only place inside of a method
            }
        }

        Inner1 i = new Inner1(); // notice we need to create the object of the method's inner class here in order to access that inner class's methods
        i.test1();
    }
}


