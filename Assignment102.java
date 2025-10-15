import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment102 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate after10Days = today.plusDays(10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Today's date: " + today.format(formatter));
        System.out.println("Date after 10 days: " + after10Days.format(formatter));
    }
}
