import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                continue; 
            }

            switch (choice) {
                case 1: 
                    System.out.print("Enter the item to be inserted: ");
                    String itemToInsert = scanner.nextLine();
                    itemList.add(itemToInsert);
                    System.out.println("Inserted successfully");
                    break;

                case 2: 
                    System.out.print("Enter the item to search: ");
                    String itemToSearch = scanner.nextLine();
                    if (itemList.contains(itemToSearch)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter the item to delete: ");
                    String itemToDelete = scanner.nextLine();
                    if (itemList.remove(itemToDelete)) {
                        System.out.println("Deleted successfully");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4: 
                    System.out.println("The Items in the list are :");
                    for (String item : itemList) {
                        System.out.println(item);
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close(); 
                    System.exit(0); 
                    break;

                default: 
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }
}