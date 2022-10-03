import java.text.DecimalFormat;
import java.util.Scanner;
public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = getNumberPowerOf(number,power);
        System.out.print(new DecimalFormat("0.####").format(result));
    }
    private static double getNumberPowerOf(double number, int power)
    {
        double result = 1;
        for (int i = 0; i < power; i++)
        {
            result *= number;
        }
        return result;
    }
}