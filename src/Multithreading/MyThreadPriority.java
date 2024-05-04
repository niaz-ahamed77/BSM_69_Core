package Multithreading;

public class MyThreadPriority {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        MyThread4 t1 = new MyThread4();
        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());
        t.setPriority(10);
        t.start();  // this indirectly calls the overrided run method of the MyThread3
        t1.start(); // this indirectly calls the overrided run method of the MyThread4
        for (int i = 0; i < 4; i++){
            System.out.println("Main Thread" + Thread.currentThread().getName());
        }
    }
}

class MyThread3 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<4; i++){
            System.out.println("Child Thread" + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}

class MyThread4 extends Thread{
    @Override
    public void run(){
        Thread.currentThread().setName("T-2");
        Thread.currentThread().setPriority(7);
        for(int i = 0; i<4; i++){
            System.out.println("Child2 Thread" + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getPriority());
    }
}



