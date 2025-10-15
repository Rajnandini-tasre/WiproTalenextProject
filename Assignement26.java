import java.util.Arrays;

public class Assignement25 {
    public static void main(String[] args) {
       
        int[] arr = {42, 15, 7, 89, 23, 5};


        Arrays.sort(arr);

        
        System.out.println("Array in sorted order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
