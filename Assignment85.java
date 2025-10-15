import java.util.*;

public class Assignment85 {

    private HashMap<String, String> object;

    public Assignment85() {
        object = new HashMap<>();
    }

    public void addStateCapital(String state, String capital) {
        object.put(state, capital);
    }

    public void listAllStatesAndCapitals() {
        Iterator<Map.Entry<String, String>> it = object.entrySet().iterator();
        System.out.println("States and Capitals of India:");
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Assignment85 india = new Assignment85();

        india.addStateCapital("Maharashtra", "Mumbai");
        india.addStateCapital("Karnataka", "Bangalore");
        india.addStateCapital("Tamil Nadu", "Chennai");
        india.addStateCapital("Gujarat", "Gandhinagar");
        india.addStateCapital("Punjab", "Chandigarh");

        india.listAllStatesAndCapitals();
    }
}
