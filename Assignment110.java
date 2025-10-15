import java.util.Arrays;

class Sorter {
    public static int[] SortValue(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

public class Assignment110 {
    public static void main(String[] args) {
        int[] numbers = { 20, 5, 15, 2, 10 };

        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] sortedNumbers = Sorter.SortValue(numbers);

        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
    }
}
