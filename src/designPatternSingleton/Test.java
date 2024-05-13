package designPatternSingleton;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Singleton s = Singleton.getInstanceTS();
        Singleton s2 = Singleton.getInstance(); // no exception, it'll refer to the instance alr created
        Singleton s1 = (Singleton) s.clone();   // this gives us an exception because it's used to create another instance
        s.test();
    }        
}


