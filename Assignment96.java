import java.util.*;

public class Assignment96 {

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 12, 7, 9, 3, 15, 8, 10, 6, 4));

        System.out.println("ArrayList elements: " + numbers);

        int sum = calculateSum(numbers);

        System.out.println("Sum of all elements: " + sum);
    }
}
