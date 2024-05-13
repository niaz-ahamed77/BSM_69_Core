package designPatternSingleton;

public class Singleton implements Cloneable{
    private volatile static Singleton _instance;
    private Singleton(){ // preventing Singleton object instantiation from outside

    }

    /*
     * 1st version: creates multiple instance if two thread access this method simultaneously
     */
    public static Singleton getInstance(){
        if (_instance == null){
            _instance = new Singleton();
        }
        return _instance;
    }

    /*
     * 2nd version: this definitely thread-safe and only creates one instance of Singleton on concurrent environment but unecessarily expensive due to cost of synchronization at every call.
     */
     public static synchronized Singleton getInstanceTS(){
        if(_instance == null){
            _instance = new Singleton();
        }
        return _instance;
     }

     /*
      * 3rd verson: an implementation of double checked locking of Singleton. Intention is to minimize the cost of synchronization and improve performance, by only locking critical section of code, the code which creates instance of Singleton class. This way can still be broken if we don't make _instance volatile, as another thread can see a half initialized instance of Singleton. This is the version we use in industry.
      */
      public static Singleton getInstanceDC(){
        if (_instance == null){
            synchronized (Singleton.class){
                if (_instance == null){
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
      }

      @Override
      protected Object clone() throws CloneNotSupportedException{
        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        throw new CloneNotSupportedException();
        //return super.clone();
      }

      void test(){
        System.out.println("Hello Singleton Test");
      }
}
