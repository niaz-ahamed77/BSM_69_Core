package Polymorphism;

public class Abs1 extends Abs {

    public Abs1(){
        super(1,50);
        firstIndex = 100;
        lastIndex = 200;
    }

    @Override
    void test() {
        System.out.println(firstIndex + "," + lastIndex);
    }
    
}
