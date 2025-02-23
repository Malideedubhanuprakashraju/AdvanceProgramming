package CollectionFramework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface
{
    public static void main(String[] args)
    {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque);
        System.out.println(deque.poll());

        Deque<Integer> deque2 = new LinkedList<>();
        deque2.add(101);
        deque2.add(202);
        deque2.add(303);
        System.out.println(deque2);

    }
}
