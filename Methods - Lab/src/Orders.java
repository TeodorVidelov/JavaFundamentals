import java.util.Scanner;
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printOrder(product,quantity);

    }
    private static void printOrder(String product, int quantity)
    {
        double bill = 0;
        switch (product)
        {
            case "coffee":
                bill = 1.5  * quantity;
                break;
            case "water":
                bill = 1.0 * quantity;
                break;
            case "coke":
                bill = 1.4  * quantity;
                break;
            case "snacks":
                bill = 2.0 * quantity;
                break;
        }
        System.out.printf("%.2f",bill);
    }
}