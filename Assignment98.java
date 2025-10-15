import java.util.*;
import java.util.stream.*;

public class Assignment98 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 9, 10, 16, 20, 25, 30, 36, 40, 49));

        System.out.println("Original ArrayList: " + numbers);


        List<Integer> perfectSquares = numbers.stream()
                .filter(n -> {
                    int sqrt = (int)Math.sqrt(n);
                    return sqrt * sqrt == n;
                })
                .collect(Collectors.toList());

        System.out.println("Perfect square numbers: " + perfectSquares);
    }
}
