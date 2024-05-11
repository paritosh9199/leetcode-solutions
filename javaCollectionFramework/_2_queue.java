import java.util.*;

public class _2_queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        //initially the queue will be empty
        System.out.println(q.poll());
        System.out.println(q);
        
        //offer returns a boolean 
        // yes if the element is added to the stack 
        //false if the elemtn is not added to the stack
        System.out.println(q.offer("Hello"));
        q.offer("World");
        q.offer("Parivesh was here");
        q.offer("!");

        //we can also use q.add(); 
        //q.add will return a true if the element is added to the queue
        // else it will throgh an exception that will crash the program! 

        System.out.println(q);
        
        //removing of element from the queue
        System.out.println(q.poll());
        System.out.println(q);
        
        //getting the element at the top of the queue
        //will return null if there are no element in the queue
        System.out.println(q.peek());


    }
}
