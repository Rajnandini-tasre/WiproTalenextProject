import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment106
 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime timeAfter25Minutes = currentTime.plusMinutes(25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current time: " + currentTime.format(formatter));
        System.out.println("Time after 25 minutes: " + timeAfter25Minutes.format(formatter));
    }
}
