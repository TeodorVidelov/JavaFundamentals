import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] day = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 1 && index <= 7){
            System.out.println(day[index - 1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}