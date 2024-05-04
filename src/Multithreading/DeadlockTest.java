package Multithreading;

public class DeadlockTest {
    public static void main(String[] args) {
        DeadlockTest test = new DeadlockTest();

        final A a = test.new A();// because A is inner class of DeadlockTest
        final B b = test.new B();// because B is inner class of DeadlockTest
        //A a1 = new A();
        //B b1 = new B();
        // Thread-1

        Runnable block1 = new Runnable(){
            public void run(){
                synchronized (a) {  //synchronized block
                    try{
                        System.out.println("Block-1 Start");
                        // adding delay so that both threads can start trying to lock resources;
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println("In block 1 End");;
                    }
                }
            }
        };

        // Thread-2
        Runnable block2 = new Runnable(){
            public void run(){
                synchronized (b) {
                    System.out.println("Block-2 start ");
                    //Thread-2 have B but need A also
                    synchronized (a) {
                        System.out.println("In block 2 End");
                    }
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }


    // Resource A
    private class A{    // inner class
        private int i = 10;
        
        public int getI(){
            return i;
        }

        public void setI(int i){
            this.i = i;
        }
    }

    // Resource B
    private class B{ // inner class
        private int i = 20;

        public int getI(){
            return i;
        }

        public void setI(int i){
            this.i = i;
        }
    }

}
