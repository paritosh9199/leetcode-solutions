import java.util.*;

// called as Deque(dek! :hahahaha)
// can be used for sliding window 
public class doubleEndedQueue {
    public static void main(String[] args) {
        // will have all the funciton of queue!
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // adding the element to the last of the array
        adq.add(10);
        adq.add(20);
        adq.add(30);
        adq.offer(40);
        adq.offer(50);

        System.out.println(adq);
        
        //the function that makes array deque as array deque
        
        //adding the element to the start
        adq.offerFirst(60);
        
        //adding the element to the end
        adq.offerLast(70);
        
        System.out.println(adq);
        
        //getting the element at the start
        //peekfirst is same as peek
        System.out.println("peekFirst() "+adq.peekFirst());
        System.out.println("peek() "+adq.peek());
        
        //getting the element at the end
        System.out.println("peekLast() "+adq.peekLast());
        
        //removing the element at the start
        //pollfirst is same as poll
        System.out.println("pollFirst() "+adq.pollFirst());
        System.out.println("poll() "+adq.poll());
        
        //removing the element from the end
        System.out.println("poll() "+adq.pollLast());
        
        System.out.println(adq);


    }
}
