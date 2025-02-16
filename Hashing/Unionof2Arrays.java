// Union of 2 Arrays using HashSet
package Hashing;

import java.util.HashSet;

public class Unionof2Arrays {
    
    public static void unionofTwoArrays(int[] arr1, int[] arr2){ //O(n)
    
            HashSet<Integer> hashSet = new HashSet<>();
            for(int n : arr1){
                hashSet.add(n);
            }
            for(int n : arr2){
                hashSet.add(n);
            }
    
            System.out.print(hashSet.size() + "  " +hashSet);
        }
        public static void main(String args[]){
            int[] arr1 = {7,3,9};
            int[] arr2 = {6,3,9,2,9,4};
    
            unionofTwoArrays(arr1,arr2);

    }
}
