import java.util.*;

// All the operations take O(1) time 
public class hashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // adding a value to the hash map
        map.put("Pari", 01);
        map.put("Sudeep", 02);
        map.put("Jay", 03);

        System.out.println(map);

        // if the key is present and we do put the value will be overwridden
        map.put("Pari", 007);

        System.out.println(map);

        // check if key is present or not
        boolean check = map.containsKey("Pari");
        System.out.println("checking if the key \"Pari\" is present or not "+check);
        
        //check if any value is present or no
        boolean check2 = map.containsValue(01);
        System.out.println("checking if the value 01 is present or not "+check2);

        //removing of a key if needed
        //value will be printed if key exist else null!
        // System.out.println("removal of the key "+ map.remove("Pari"));
        System.out.println("removal of the key "+ map.remove("Something"));

        // Adding of key only if it is not there in the map
        // there is no chance of value being overwridden here
        map.putIfAbsent("Nam", 01);

        // iterating of a map;
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            // will print key=value
            System.out.println(i);
            System.out.println(i.getKey() + " " + i.getValue());
        }

        // only iterate through the keys
        for (String i : map.keySet()) {
            System.out.println("keys "+i);

            //easier way to iterate through the map
            // System.out.println(i+" "+map.get(i));
        }
        
        //only iterate through the value
        for(int i:map.values()){
            System.out.println("values "+i);
        }

        //checks if the map is empty or not
        System.out.println("is map empty? "+map.isEmpty());

        System.out.println(map);
        
        map.clear();
        System.out.println(map);
    }
}
