import java.util.Scanner;
public class FactorialDivision {

    private static void getFactorial (double factorialNumber, double divideNumber)
    {
        double sum1 = 1;
        double sum2 = 1;

        for (int i = 1; i <= factorialNumber; i++)
        {
            sum1 *= i;
        }
        for (int i = 1; i <= divideNumber; i++) {
            sum2 *= i;
        }

        System.out.printf("%.2f",sum1 / sum2 );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double factorialNumber = Double.parseDouble(scanner.nextLine());
        double divideNumber = Double.parseDouble(scanner.nextLine());

       getFactorial(factorialNumber,divideNumber);
    }
}