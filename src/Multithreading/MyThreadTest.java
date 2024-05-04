package Multithreading;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        Thread t1 = new Thread(m1);
        t1.start();
        for(int i=20; i<=30; i++){
            System.out.println(i);
        }
    }
}

class MyThread1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
    }
}

