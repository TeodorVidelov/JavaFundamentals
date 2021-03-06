import java.util.Scanner;
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        for (int i = 0; i < countOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderSum = pricePerCapsule * days * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f\n",orderSum);
            totalSum += orderSum;
        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}