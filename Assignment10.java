import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a color code (R, B, G, O, Y, W): ");
        char code = sc.next().toUpperCase().charAt(0);

        String colorName;

        
        switch (code) {
            case 'R':
                colorName = "Red";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'O':
                colorName = "Orange";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            case 'W':
                colorName = "White";
                break;
            default:
                colorName = "Invalid color code";
        }

       
        System.out.println(colorName);

        sc.close();
    }
}
