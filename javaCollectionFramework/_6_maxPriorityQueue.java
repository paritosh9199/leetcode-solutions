import java.util.*;

public class _6_maxPriorityQueue {
    public static void main(String[] args) {
        //creates a max heap!
        //Comparator.reverseOrder() = max heap!
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add("Hello");
        pq.offer("World");
        pq.offer("Parivesh was here");
        pq.offer("!");
        
        //opposite of lexicographical order
        // pq.offer("A");
        // pq.offer("a");
        // pq.offer("Aa");
        // pq.offer("9");
        // pq.offer("!");
        // [a, A, Aa, 9, !]

        System.out.println(pq);

        //dequeuig the queue
        String var1 = pq.poll();
        System.out.println(var1);

        System.out.println(pq);

        //checking the element at top
        System.out.println(pq.peek());
    }
}
