import java.util.Scanner;
public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int populationOfTown = Integer.parseInt(scanner.nextLine());
        int areaOfTown = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,populationOfTown,areaOfTown);
    }
}