package multipleInheritanceInInterface;

public class Test implements A,B{
    public static void main(String[] args) {
        Test t = new Test();
        t.test(); // it will call the Test class, test() method.
    
    }

    @Override
    public void calculate(){

    }

    @Override
    public void test(){
        B.super.test(); // Java has changed the rule to allow us to specify the interface being called with super
    }
}


