package Polymorphism;

public class AbsClassTest {
    public static void main(String[] args) {
        Abs mc = new Abs1();    // it will call all methods from parent (Abs) aswell as overidden methods of the child (Abs1). Thus, even though we didn't override test1() in Abs1, it can be taken from the parent, Abs.
        mc.test();
        mc.test1();
    }
}
