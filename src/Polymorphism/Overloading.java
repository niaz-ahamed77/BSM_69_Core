package polymorphism;

public class Overloading {
    void test(){
        System.out.println("test 1");
    }

    void test(int x){
        System.out.println("test 2");
    }

    int test(String msg){
        System.out.println(msg);
        return 100;
    }

    public static void main(String[] args) {
        Overloading p = new Overloading();
        p.test("test");
        p.test();
        p.test(100);
    }
}
