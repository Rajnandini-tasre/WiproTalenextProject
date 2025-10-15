import java.util.*;

public class Assignment78 {
    public static <T extends Number> void printList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
    
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);       
        numbers.add(20.5);     
        numbers.add(15.75f);   
        numbers.add(100L);     

        System.out.println("Printing numbers:");
        printList(numbers);

       
         numbers.add("Hello"); 
    }
}
