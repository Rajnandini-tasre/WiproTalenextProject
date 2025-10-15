public class Assignment30 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 12, 7, 6, 1};
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

    
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

       
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
