public class Assignment31 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 1}; 
        boolean valid = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                valid = false;
                break;
            }
        }

        System.out.println(valid);
    }
}
