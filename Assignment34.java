public class Assignment34 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please provide exactly 9 integers as command-line arguments.");
            return;
        }

        int[][] arr = new int[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Biggest number in the 3x3 array: " + max);
    }
}
