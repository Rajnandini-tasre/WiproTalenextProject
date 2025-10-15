import java.util.Arrays;

class Sorter {
    public static int[] SortValue(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

public class Assignment109{
    public static void main(String[] args) {
        int[] numbers = { 12, 5, 9, 1, 15, 7 };

        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] sortedNumbers = Sorter.SortValue(numbers);

        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
    }
}
