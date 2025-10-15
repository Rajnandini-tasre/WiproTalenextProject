import java.util.*;

public class Assignment80 {

    private HashSet<String> h1;

    public Assignment80() {
        h1 = new HashSet<>();
    }

    public HashSet<String> SaveCountryStringCountryName(String countryName) {
        h1.add(countryName);
        return h1;
    }

    public String GetCountryStringCountryName(String countryName) {
        for (String country : h1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Assignment80 countryManager = new Assignment80();

        countryManager.SaveCountryStringCountryName("India");
        countryManager.SaveCountryStringCountryName("USA");
        countryManager.SaveCountryStringCountryName("Canada");

        System.out.println("All countries in HashSet: " + countryManager.h1);

        String searchCountry1 = "USA";
        String result1 = countryManager.GetCountryStringCountryName(searchCountry1);
        System.out.println("Search for " + searchCountry1 + ": " + result1);

        String searchCountry2 = "Germany";
        String result2 = countryManager.GetCountryStringCountryName(searchCountry2);
        System.out.println("Search for " + searchCountry2 + ": " + result2);
    }
}
