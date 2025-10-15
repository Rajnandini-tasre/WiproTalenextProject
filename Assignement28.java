public class Assignement28 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 3, 7, 4, 5};
        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                ignore = true;
                continue;
            }
            if (ignore && arr[i] == 7) {
                ignore = false;
                continue;
            }
            if (!ignore) {
                sum += arr[i];
            }
        }

        System.out.println("Sum: " + sum);
    }
}
