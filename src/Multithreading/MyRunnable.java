package Multithreading;

public class MyRunnable implements Runnable {
    
    public static void main(String[] args) {
        
        //Using MyThreadExample (which extends Thread) to create a thread object
        MyThreadExample thread = new MyThreadExample();
        thread.start();

        //Using runnable() to create a thread
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

    }
    
    public void run(){
        System.out.println("Runnable thread running: " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);  // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable thread finished: " + Thread.currentThread().getId());
    }
}


