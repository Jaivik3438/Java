import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {

        // Creation
        HashSet<Integer> set = new HashSet<>();

       
        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

       
        // Size
        System.out.println("Size of Set: " + set.size());

        // Print all elements
        System.out.println("Print all elements: " + set);

        // Serach- Contains
        if (set.contains(1)) {
            System.out.println("Set Contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contains 6");
        }

        // Delete
        set.remove(1);

        if (!set.contains(1)) {
            System.out.println("Removed 1");
        }

        System.out.println("Size of Set: " + set.size());

        System.out.println("-----------------------------------");

        // Iterator
        Iterator it = set.iterator();
        
        // Iterate hasset
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
