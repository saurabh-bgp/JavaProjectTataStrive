import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<Number> que1=new ArrayDeque<>();
        que1.offer(52);
        que1.add(45.6);
        que1.offerFirst(98.8);
        que1.offerLast(74);
        System.out.println(que1);
        Number pee = que1.peek();
        System.out.println(pee);
        Number peef = que1.peekFirst();
        System.out.println(peef);
        Number peel = que1.peek();
        System.out.println(peel);
        Number pol = que1.poll();
        System.out.println(pol);
        Number polf = que1.pollFirst();
        System.out.println(polf);
        Number  poll = que1.pollLast();
        System.out.println(poll);
        System.out.println(que1);

        System.out.println();

        Queue<Number> queue2 = new LinkedList<>();
        queue2.add(45);
        queue2.offer(87.6);
        queue2.add(54.55);
        queue2.offer(87);
        queue2.add(89.1);
        System.out.println(queue2);
        System.out.println(queue2.peek());
        System.out.println(queue2.poll());
        System.out.println(queue2);

    }
}
