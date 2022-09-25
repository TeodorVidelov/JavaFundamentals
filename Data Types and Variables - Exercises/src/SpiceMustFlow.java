import java.util.Scanner;
public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYieldOfTheSource = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int amount = 0;

        while (startingYieldOfTheSource > 0)
        {
            if (startingYieldOfTheSource < 100)
            {
                if (amount < 26){
                    break;
                }
                amount -= 26;
                break;
            }
            amount += startingYieldOfTheSource - 26;
            startingYieldOfTheSource -= 10;
            countDays++;
        }
        System.out.println(countDays);
        System.out.println(amount);
    }
}