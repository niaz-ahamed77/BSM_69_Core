package markerInterface;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // Example e = new example();
        Constructor<Example> pcc = Example.class.getDeclaredConstructor();
        
        pcc.setAccessible(true);
        Example privateConstructorInstance = pcc.newInstance();

        Method method = Example.class.getDeclaredMethod("test",null);  // (methodname, argument of method)
        method.setAccessible(true);
        method.invoke(privateConstructorInstance);

        Example2 e = new Example2();
        Method method1 = Example2.class.getDeclaredMethod("test", String.class);
        method1.setAccessible(true);
        System.out.println(method1.invoke(e,"Hello")); //input that will pass into the parameter of the private method
    }
}

