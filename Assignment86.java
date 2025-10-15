import java.util.*;
import java.util.stream.*;

public class Assignment86 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        System.out.println("Random Numbers: " + numbers);

        System.out.println("\nPrime Numbers in the list:");
        numbers.stream()
                .filter(Assignment86::isPrime)
                .forEach(System.out::println);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
