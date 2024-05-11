import java.util.*;

public class _5_minPriorityQueue {
    public static void main(String[] args) {
        //creates a min heap!
        //Comparator.naturalOrder() = min heap
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.naturalOrder());

        pq.add("Hello");
        pq.offer("World");
        pq.offer("Parivesh was here");
        pq.offer("!");
        
        //the elements will be added in lexicographical order!
        //and kinda follows the ascii table!
        //like the symbol is first then number then uppercase
        //and at the last lower cases 
        // pq.offer("A");
        // pq.offer("a");
        // pq.offer("Aa");
        // pq.offer("9");
        // pq.offer("!");
        // [!, 9, Aa, a, A]

        System.out.println(pq);

        //dequeuig the queue
        String var1 = pq.poll();
        System.out.println(var1);

        System.out.println(pq);

        //checking the element at top
        System.out.println(pq.peek());
    }
}
