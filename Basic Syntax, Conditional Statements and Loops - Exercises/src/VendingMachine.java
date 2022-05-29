import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!"Start".equals(input)){
            double insertedMoney = Double.parseDouble(input);
            if (0.1 == insertedMoney || 0.2 == insertedMoney || 0.5 == insertedMoney
                || 1 == insertedMoney || 2 == insertedMoney){
            sum += insertedMoney;
        }
        else {
            System.out.printf("Cannot accept %.2f\n",insertedMoney);
        }
            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();

        while (!"End".equals(input2)){
            String typePurchase = input2;

            switch (typePurchase){
                case "Nuts":
                    if (sum >= 2.0){
                        sum -= 2.0;
                        System.out.printf("Purchased %s\n",typePurchase);
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7){
                        sum -= 0.7;
                        System.out.printf("Purchased %s\n",typePurchase);
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5){
                        sum -= 1.5;
                        System.out.printf("Purchased %s\n",typePurchase);
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8){
                        sum -= 0.8;
                        System.out.printf("Purchased %s\n",typePurchase);
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0){
                        sum -= 1.0;
                        System.out.printf("Purchased %s\n",typePurchase);
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }

            input2 = scanner.nextLine();
        }
            System.out.printf("Change: %.2f",sum);
    }
}