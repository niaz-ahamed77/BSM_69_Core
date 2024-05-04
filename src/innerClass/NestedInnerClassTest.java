package innerClass;

public class NestedInnerClassTest {
    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();
        o.test();
    }
}

class Outer{
    private Integer x = 100;

    class Inner{
        void test(){
            System.out.println(x);
        }
    }
}

