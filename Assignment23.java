import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
           int[] arr = {10, 25, 30, 42, 55};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        int index = -1; 

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break; 
            }
        }

       
        System.out.println(index);

        sc.close();
    }
}
