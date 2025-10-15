
@FunctionalInterface
interface PrimeChecker {
    void check(int n);
}
class MyNumber {
    public MyNumber(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class Assignment91 {
    public static void main(String[] args) {
        PrimeChecker pc = MyNumber::new;

        int number1 = 17;
        int number2 = 20;

        pc.check(number1);
        pc.check(number2); 
    }
}
