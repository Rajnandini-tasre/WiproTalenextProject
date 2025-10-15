public class Assignement8 {
    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Please provide gender and age as command-line arguments.");
            System.out.println("Example: java InterestCalculator female 25");
            return;
        }

        String gender = args[0].toLowerCase();
        int age = 0;
        double interest = 0.0;

        if (gender.equals("female")) {
            if (age >= 1 && age <= 58) {
                interest = 8.2;
            } else if (age >= 59 && age <= 100) {
                interest = 9.2;
            } else {
                System.out.println("Age out of range (1-100).");
                return;
            }
        } else if (gender.equals("male")) {
            if (age >= 1 && age <= 58) {
                interest = 8.4;
            } else if (age >= 59 && age <= 100) {
                interest = 10.5;
            } else {
                System.out.println("Age out of range (1-100).");
                return;
            }
        } else {
            System.out.println("Invalid gender. Please enter 'male' or 'female'.");
            return;
        }

        System.out.println("The percentage of interest is: " + interest + "%");
    }
}
