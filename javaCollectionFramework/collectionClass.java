import java.util.*;

public class collectionClass {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(10);
        l.add(50);
        l.add(10);
        l.add(40);
        l.add(20);
        l.add(30);
        l.add(50);
        l.add(50);

        System.out.println("smallest element in the list "+ Collections.min(l));
        System.out.println("largest element in the list "+ Collections.max(l));
        System.out.println("frequency of element 50 is "+ Collections.frequency(l,50));

        //sorting in ascending order
        Collections.sort(l);
        System.out.println(l);
        
        //sorting in descending order
        Collections.sort(l,Comparator.reverseOrder());
        System.out.println(l);
    }
}
