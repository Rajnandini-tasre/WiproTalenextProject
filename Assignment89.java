
@FunctionalInterface
interface FactorialInterface {
    int calculate(int n);
}


class MyMath {
    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Assignment89 {
    public static void main(String[] args) {
        MyMath math = new MyMath();

       
        FactorialInterface fi = math::factorial;

        int number = 5;
        int fact = fi.calculate(number);

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
