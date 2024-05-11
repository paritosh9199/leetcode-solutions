import java.util.*;

//all the set have one thin in common and that is they cant have duplicates
//ie set will have all unique values!

public class _3_hashSet {
    public static void main(String[] args) {
        //all the operations will be done in O(1) time complexity
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(4);
        hs.add(69);
        hs.add(81);
        hs.add(5);
        hs.add(10);
        hs.add(2);

        hs.add(10);
        hs.add(10);
        hs.add(10); 

        System.out.println(hs);
        
        //removing of element from the set
        hs.remove(69);
        System.out.println(hs);
        
        //check if the element is present or not
        System.out.println(hs.contains(10));
        
        System.out.println(hs.hashCode());
        hs.clear();
        
    }
}
