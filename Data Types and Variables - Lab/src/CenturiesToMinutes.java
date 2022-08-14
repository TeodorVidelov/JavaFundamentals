import java.util.Scanner;
public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        int years = centuries * 100;
        int averageDays = (int)(years * 365.2422);
        int hours = averageDays * 24;
        int minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,averageDays,hours,minutes);
    }
}