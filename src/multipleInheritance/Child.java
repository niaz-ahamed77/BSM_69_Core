package multipleInheritance;

//public class Child extends Parent1, Parent2{
public class Child implements ParentInterface1, ParentInterface2{
    Child(){
        super();    // there's ambiguity between choosing the constructor from parent 1 or parent 2 in this case, this is why java doesn't support multiple inheritance
    }

    void test(){
        //super()
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.test();   // will
    }
}
