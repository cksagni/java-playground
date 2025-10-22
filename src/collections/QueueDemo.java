package collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, "a", "b", "c");
        System.out.println(queue);
        queue.add("d");
        System.out.println(queue);
        queue.offer("e");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
}
