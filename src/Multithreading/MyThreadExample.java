package Multithreading;

public class MyThreadExample extends Thread{
    
    public static void main(String[] args) {
        MyThreadExample thread1 = new MyThreadExample();
        thread1.start();
        MyThreadExample thread2 = new MyThreadExample();
        thread2.start();
        MyThreadExample thread3 = new MyThreadExample();
        thread3.start();
    }
    
    @Override
    public void run(){
        System.out.println("Thread running: " + Thread.currentThread().getId());
        try{
            //Thread.sleep(1000); // simulate some work
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread finished: " + Thread.currentThread().getId());
    }
}
