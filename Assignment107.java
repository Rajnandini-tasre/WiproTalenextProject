import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment107 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime timeBefore = currentTime.minusHours(5).minusMinutes(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current time: " + currentTime.format(formatter));
        System.out.println("Time before 5 hours 30 minutes: " + timeBefore.format(formatter));
    }
}
