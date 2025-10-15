public class Assignment3{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly 2 integers as command-line arguments.");
            return;
        }

        try {
            // Convert command-line arguments from String to int
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;

            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
