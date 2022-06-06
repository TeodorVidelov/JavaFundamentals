import java.util.Scanner;
public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfSingleLightSaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double totalPriceOfLightSabers = priceOfSingleLightSaber * Math.ceil(countOfStudents * 1.10);
        double freeBelts = Math.floor(countOfStudents / 6.0);
        double totalPriceOfBelts = (countOfStudents - freeBelts) * priceOfBelts;
        double totalPriceOfRobes = priceOfRobes * countOfStudents;

        double totalSum = totalPriceOfBelts + totalPriceOfLightSabers + totalPriceOfRobes;

        if (totalSum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(totalSum - budget));
        }
    }
}