import java.util.*;

public class arryaClass {
    public static void main(String[] args) {

        int ar[] = {4,1,2,5,6,3,1,6,7,6,9,8,69};

        //this uses quick sort
        // hence time complexity is O(log n)
        Arrays.sort(ar);

        //other type of sort is parlell sort
        //if the number of element in the array is greater than 8192 then it will use parlell sort
        //or else it will directly use quick sort


        for(int i:ar) System.out.print(i+" ");
        System.out.println();
        
        int index = Arrays.binarySearch(ar,4);
        System.out.println("index of element 4 is "+index);
        
        //filling of value into an array
        Arrays.fill(ar,123);
        for(int i:ar) System.out.print(i+" ");
        System.out.println();

    }
}
