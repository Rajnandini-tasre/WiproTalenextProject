import java.io.*;
import java.util.Scanner;

public class Assignment72{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String destFile = sc.nextLine();

        try (FileInputStream fin = new FileInputStream(sourceFile);
             FileOutputStream fout = new FileOutputStream(destFile)) {

            int c;
            while ((c = fin.read()) != -1) {
                fout.write(c);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } 
        catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } 
        catch (IOException e) {
            System.out.println("Error while copying file.");
        }

        sc.close();
    }
}
