import java.util.Scanner;
public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double priceOHeadSet = Double.parseDouble(scanner.nextLine());
        double priceOfMouse = Double.parseDouble(scanner.nextLine());
        double priceOfKeyboard = Double.parseDouble(scanner.nextLine());
        double priceOfDisplay = Double.parseDouble(scanner.nextLine());

        int countTrashHeadsets = lostGamesCount / 2;
        int countTrashMice = lostGamesCount / 3;
        int countTrashKeyboards = lostGamesCount / 6;
        int countTrashDisplay = countTrashKeyboards / 2;

        double totalSum = countTrashHeadsets * priceOHeadSet +  countTrashMice * priceOfMouse +
                countTrashKeyboards * priceOfKeyboard + countTrashDisplay * priceOfDisplay;

        System.out.printf("Rage expenses: %.2f lv.",totalSum);
    }
}