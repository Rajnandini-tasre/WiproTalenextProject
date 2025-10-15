import java.util.*;

public class Assignment82 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        System.out.println("Original TreeSet (sorted in natural order):");
        System.out.println(treeSet);

        NavigableSet<String> reversedSet = treeSet.descendingSet();
        System.out.println("\nReversed TreeSet:");
        System.out.println(reversedSet);

        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        String searchElement = "Cherry";
        if (treeSet.contains(searchElement)) {
            System.out.println("\nElement '" + searchElement + "' exists in the TreeSet.");
        } else {
            System.out.println("\nElement '" + searchElement + "' does not exist in the TreeSet.");
        }
    }
}
