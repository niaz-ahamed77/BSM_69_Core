package innerClass;

interface Myinterface{
    void test();
}

//typically, this is how I would have to use the interface:
// class MyClass implements Myinterface{
//     @Override
//     public void test(){

//     }
// }

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        Myinterface mi = new Myinterface() {
            @Override
            public void test(){
                System.out.println("Anonymous inner class");
            }
        };
        mi.test();
    }
}




