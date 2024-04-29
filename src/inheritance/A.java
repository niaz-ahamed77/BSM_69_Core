package inheritance;

public class A {
    A(){
        this(100);
        System.out.println("A constructor");
    }
    
    A(int x){
        System.out.println(x);
    }

    A(String x){
        this(); // used to call current class constructors whereas super is used to call parent class constructor
        System.out.println(x);
    }
}
