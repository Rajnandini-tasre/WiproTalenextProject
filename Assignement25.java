import java.util.Arrays;

public class Assignement25{
    public static void main(String[] args) {

        int[] arr = {15, 42, 7, 23, 89, 5, 67};

      
        Arrays.sort(arr);


        int smallest1 = arr[0];
        int smallest2 = arr[1];


        int largest1 = arr[arr.length - 1];
        int largest2 = arr[arr.length - 2];

        
        System.out.println("Two smallest numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Two largest numbers: " + largest2 + ", " + largest1);
    }
}
