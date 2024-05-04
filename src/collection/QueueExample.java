package collection;

import java.util.LinkedList;
import java.util.Queue;

// Queue follows FIFO

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i <= 5; i++){
            queue.add(i);
        }

        System.out.println(queue);
        System.out.println("==================");
        System.out.println(".remove() is called:" + queue.remove());
        System.out.println("queue: " + queue);
        System.out.println(".peek() is called: " + queue.peek()); // retrieves top element from queue
        System.out.println("==================");
        System.out.println("queue: " + queue);
        System.out.println("==================");
        System.out.println(".poll() is called: " + queue.poll()); // retrieves top element from queue and removes it
        System.out.println("==================");
        System.out.println("queue: " + queue);
    }
}
