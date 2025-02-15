package Hashing;
import java.util.*;

public class HashingMap {
    public static void main(String[] args) {
        
        //Creating HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        //Insertion

        hashMap.put("India", 120);
        hashMap.put("Canada",10);
        hashMap.put("USA",30);
        
        System.out.println(hashMap);

        hashMap.put("India", 150);
        System.out.println(hashMap);

        //Serach in HashMap
        if(hashMap.containsKey("India")){
            System.out.println("Key is present in the hashMap");
        }
        else{
            System.out.println("Key is not present in the hashMap");
        }

        System.out.println(hashMap.get("USA")); // Return Value of USA key
        System.out.println(hashMap.get("Chaina")); // return null value as key = Chaina is not present in the HashMap

        // Interate HashMap using entrySet : We will use this
        for(Map.Entry<String,Integer> e : hashMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e);
        }

        // Another approch to iterate using keySet
        Set<String> keys = hashMap.keySet();
        for(String key : keys){
            System.out.println("Keys : Values " + key + " : " +hashMap.get(key));
        }

        //Remove element from HashMap
        hashMap.remove("USA");

        System.out.println(hashMap);
    }
}
