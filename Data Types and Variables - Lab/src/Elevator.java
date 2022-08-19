import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personToElevate = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(personToElevate * 1.0 / elevatorCapacity);

        System.out.printf("%.0f",courses);
    }
}