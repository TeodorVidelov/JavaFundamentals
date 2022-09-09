import java.util.Scanner;
public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int capacityOfTank = 255;
        int sum = 0;
        for (int i = 0; i < count; i++)
        {
            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());

            if (sum + quantitiesOfWater > capacityOfTank)
            {
                System.out.println("Insufficient capacity!");
            }
            else
            {
            sum += quantitiesOfWater;
            }
        }
        System.out.print(sum);
    }
}