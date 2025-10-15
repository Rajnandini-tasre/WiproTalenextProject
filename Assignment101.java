import java.util.*;
import java.util.function.Supplier;

public class Assignment101 {
        public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Number of prime numbers to generate

        
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < n) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };


        ArrayList<Integer> primeNumbers = primeSupplier.get();

        System.out.println("First " + n + " prime numbers: " + primeNumbers);
    }
}
