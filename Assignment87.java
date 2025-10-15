import java.util.*;

public class Assignment87 {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();

        AL.add("Java");
        AL.add("Python");
        AL.add("C++");
        AL.add("JavaScript");
        AL.add("Ruby");
        AL.add("Swift");
        AL.add("Kotlin");
        AL.add("Go");
        AL.add("PHP");
        AL.add("Scala");

        System.out.println("Original List: " + AL);

        System.out.println("\nStrings in Reverse Order:");
        Collections.reverse(AL);
        AL.forEach(s -> System.out.println(s));
    }
}
