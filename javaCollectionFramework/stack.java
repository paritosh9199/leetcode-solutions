import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // checking the default size of the stack
        //idk how to chekc this for list! :(
        System.out.println(stack.capacity());

        stack.push("Hello");
        stack.push("World");
        stack.push("Parivesh was here");
        stack.push("!"); 

        System.out.println(stack);

        //findign the element at the top
        System.out.println(stack.peek());
        System.out.println(stack.lastElement());
        
        //removing the element at the top
        stack.pop();
        System.out.println(stack.peek());

        //check if the stack is empty or not
        System.out.println(stack.empty());

        //check the size of the stack
        System.out.println(stack.size()); 

        //check if the element is present in the stack or not
        System.out.println(stack.contains("Hello")); 
        System.out.println(stack.contains("Hello everyone")); 
    }
}
