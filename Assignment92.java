import java.util.*;
import java.util.stream.*;

public class Assignment92 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, -2, -7, -8, 3, 4, -12, 9, -6));

        System.out.println("Original ArrayList: " + numbers);

   
        ArrayList<Integer> negativeEven = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Negative even numbers: " + negativeEven);
    }
}
