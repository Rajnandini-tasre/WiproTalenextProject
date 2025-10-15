public class Assignment68 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("Binary equivalent: " + Integer.toBinaryString(num));
        System.out.println("Octal equivalent: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(num));
    }
}
