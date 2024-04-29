package inheritance;

public class C {
    static{
        System.out.println("static block");
    }
    C(){
        this(10);
        // IIB calling statement
        System.out.println("C Constructor");
    }

    C(int x){
        System.out.println(x);
    }

    {
        System.out.println("IIB");
    }

    {
        System.out.println("IIB 2");
    }
    
    public static void main(String[] args) {
        System.out.println("main");
        //C c1 = new C();
        C c1 = new C(100);
    }
}


