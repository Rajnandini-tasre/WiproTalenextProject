import java.util.*;

public class Assignment83 {

    private HashMap<String, String> m1;

    public Assignment83() {
        m1 = new HashMap<>();
    }

    public HashMap<String, String> SaveCountry(String country, String capital) {
        m1.put(country, capital);
        return m1;
    }

    public String GetCapital(String country) {
        return m1.getOrDefault(country, null);
    }

    public String GetCountry(String capital) {
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capital)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public HashMap<String, String> ReverseMap() {
        HashMap<String, String> m2 = new HashMap<>();
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            m2.put(entry.getValue(), entry.getKey());
        }
        return m2;
    }

    public ArrayList<String> GetAllCountries() {
        return new ArrayList<>(m1.keySet());
    }
    public static void main(String[] args) {
        Assignment83 manager = new Assignment83();

        manager.SaveCountry("India", "Delhi");
        manager.SaveCountry("Japan", "Tokyo");
        manager.SaveCountry("USA", "Washington");
        manager.SaveCountry("France", "Paris");

        System.out.println("Map m1: " + manager.m1);

        System.out.println("Capital of Japan: " + manager.GetCapital("Japan"));
        System.out.println("Country with capital Paris: " + manager.GetCountry("Paris"));

        HashMap<String, String> m2 = manager.ReverseMap();
        System.out.println("Map m2 (capital as key): " + m2);

        ArrayList<String> countries = manager.GetAllCountries();
        System.out.println("All countries: " + countries);
    }
}
