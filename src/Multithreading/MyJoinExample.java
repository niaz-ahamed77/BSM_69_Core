package Multithreading;

public class MyJoinExample {
    public static void main(String[] args) throws InterruptedException { 
        MyThread11 t = new MyThread11();
        t.start();
        t.join();// since we call join on Thread t, other threads (like the Main Thread in this case) will finish execution before Thread t is ran);

        for (int i = 0; i< 10; i++){
            System.out.println("Main Thread");
        }
    }
}

class MyThread11 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
    }
}


