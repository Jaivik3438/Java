// Given an Interger array of size n, find all elements that appear more than [n/3] times.
// num[] = {1,3,2,5,1,3,1,5,1} => output // 1
// num[] = {1,2} => // 1, 2
package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    public static void main(String[] args) {
        int num[] = {1,2};
        int n = num.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++){
            if(map.containsKey(num[i])){ // key is already exist 
                map.put(num[i], map.get(num[i]) + 1);
            }
            else{ // key does not exist
                map.put(num[i], 1);
            }
        }

        // Both ways are correct to print
        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     if(e.getValue() > n/3){
        //         System.out.print(e.getKey() + " ");
        //     }
        // }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.print(key + " ");
            }
        }
    }
}
