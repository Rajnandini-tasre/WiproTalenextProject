public class Assigment1 {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Please provide exactly 2 command-line arguments.");
            return;
        }

        String first = args[0];
        String second = args[1];

        // Generate output in the required format
        System.out.println(first + " Technologies " + second);
    }
}
