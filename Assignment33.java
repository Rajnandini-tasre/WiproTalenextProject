public class Assignment33 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please provide exactly 4 integers as command-line arguments.");
            return;
        }

        int[][] arr = new int[2][2];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
            }
        }

        int[][] reversed = new int[2][2];
        k = 3;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                reversed[i][j] = Integer.parseInt(args[k--]);
            }
        }

        System.out.println("Original 2x2 Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Reversed 2x2 Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(reversed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
