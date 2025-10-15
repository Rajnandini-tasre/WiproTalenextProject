import java.util.Arrays;

public class Assignment27 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 5, 12, 9, 7, 15};
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
