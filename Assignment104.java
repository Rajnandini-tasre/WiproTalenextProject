import java.time.*;
import java.time.format.DateTimeFormatter;

public class Assignment104 {
    public static void main(String[] args) {
        
        String joiningDateStr = "15-06-2020"; 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joiningDate = LocalDate.parse(joiningDateStr, formatter);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience in Wipro:");
        System.out.println("Years: " + experience.getYears());
        System.out.println("Months: " + experience.getMonths());
        System.out.println("Days: " + experience.getDays());
    }
}
