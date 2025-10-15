import java.util.*;

public class Assignment84 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("France", "Paris");

        String keyToCheck = "Japan";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the map.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist in the map.");
        }

        String valueToCheck = "Paris";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value '" + valueToCheck + "' exists in the map.");
        } else {
            System.out.println("Value '" + valueToCheck + "' does not exist in the map.");
        }

        System.out.println("\nIterating through the map:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
