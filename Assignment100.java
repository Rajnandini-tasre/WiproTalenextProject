import java.util.*;
import java.util.function.Consumer;

public class Assignment100 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 12, 7, 9, 3, 15, 8, 10, 6, 4));

        System.out.println("ArrayList elements and their odd/even status:");

        Consumer<Integer> displayOddEven = n -> {
            String type = (n % 2 == 0) ? "Even" : "Odd";
            System.out.println(n + " is " + type);
        };


        numbers.forEach(displayOddEven);
    }
}
