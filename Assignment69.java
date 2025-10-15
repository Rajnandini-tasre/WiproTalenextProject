import java.util.Scanner;

public class Assignment69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");
        int num = sc.nextInt();

        if (num < 1 || num > 255) {
            System.out.println("Number out of range! Please enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(num);
            System.out.println("Binary representation: " + binary);
        }

        sc.close();
    }
}
