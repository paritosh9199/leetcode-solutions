import java.util.*;

public class _4_treeSet {
    public static void main(String[] args) {
        //the set will also be sorted
        //so the all the operation will take O(log n) time compleity
        TreeSet<Integer> hs = new TreeSet<>();

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

        // removing of element from the set
        hs.remove(69);
        System.out.println(hs);

        // check if the element is present or not
        System.out.println(hs.contains(10));

        System.out.println(hs.hashCode());
        hs.clear();

    }
}
