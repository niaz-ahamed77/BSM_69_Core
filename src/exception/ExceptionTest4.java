package exception;

public class ExceptionTest4 {
    
    public static void main(String[] args) {
        
        Interface1 i = new MyClass(); // up casting 
        MyClass m = new MyClass();
        m = (MyClass) i; // down casting
        m.test1(); 
        
        
        Child c = (Child) new Parent(); // down casting. Will cause ClassCastException. This is because Parent has an implementation. so if you are calling 
        c.test();
    }
}
