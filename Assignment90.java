// Functional interface
@FunctionalInterface
interface DigitCounter {
    int count(int n);
}

class MyMath {
    public static int inDigitCount(int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

public class Assignment90 {
    public static void main(String[] args) {
        DigitCounter dc = MyMath::inDigitCount;

        int number = 123456;
        int digits = dc.count(number);

        System.out.println("Number: " + number);
        System.out.println("Number of digits: " + digits);
    }
}
