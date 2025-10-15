import java.io.*;
import java.util.Scanner;

public class Assignment71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name (with path if needed): ");
        String fileName = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        try (FileReader fr = new FileReader(fileName)) {
            int c;
            while ((c = fr.read()) != -1) {
                if ((char) c == ch) {
                    count++;
                }
            }
            System.out.println("Character '" + ch + "' appears " + count + " times in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        sc.close();
    }
}
