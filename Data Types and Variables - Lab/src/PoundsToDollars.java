import java.util.Scanner;
public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double GBP = Double.parseDouble(scanner.nextLine());

        double dollars = GBP * 1.36;
        System.out.printf("%.3f",dollars);
    }
}