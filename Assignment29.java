public class Assignment29 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2, 3, 10, 4};
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
