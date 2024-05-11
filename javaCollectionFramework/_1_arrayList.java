import java.util.*;

public class _1_arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //what is the difference between ArrayList and List!?????
        // List<String> list = new ArrayList<>();

        //the default size will be 10;
        list.add("Hello"); 

        //initial size = n;
        //when the size > n then arraylist will create a new array of size n + n/2 + 1;
        //it will also copy the element to the new array!
        //will dump the old array!
        
        list.add("World");
        list.add("!");
        System.out.println("adding of element "+list);

        list.add("Parivesh was here!");
        System.out.println("adding of element "+list);
        
        //addition of element at some index
        list.add(2,"making notes"); // O(n) time complexity
        System.out.println("adding of element at 2nd index "+list);
        
        //adding other list to another list!
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("ele1");
        l1.add("ele2");
        
        list.addAll(l1);
        System.out.println("adding of another list "+list);
        
        //getting element from the list using index
        System.out.println("getting element using index "+list.get(4));
        
        //chaning the value at some index
        list.set(4,"Was Parivesh here?"); // O(1) time complexity
        System.out.println("updating the value at a certain index "+list.get(4));
        
        //removing of element!
        //using index
        list.remove(3);
        System.out.println("removed element at index 3 "+list);
        //using value
        list.remove("ele1");
        System.out.println("removed the element havind the value \"ele1\" "+list);

        //checking from presence
        boolean check = list.contains("Parivesh was here!"); //O(n) time complexity
        System.out.println("checking element "+check);

        //iteration of the list
        for(int i=0;i<list.size();i++){
            System.out.println("element "+i+" = "+list.get(i));
        }

        for(String i:list){
            System.out.println("element is "+i);
        }

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }

        //removing all the element in the list
        list.clear(); // O(n) time complexity
        System.out.println("clearing the list "+list);
    }
}
