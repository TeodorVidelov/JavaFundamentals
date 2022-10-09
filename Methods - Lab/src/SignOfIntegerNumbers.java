import java.util.Scanner;
public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        SignOfIntegerNumbers(numbers);
    }
    private static void SignOfIntegerNumbers(int n){

        if (n > 0)
        {
            System.out.printf("The number %d is positive.",n);
        }
        else if (n < 0)
        {
            System.out.printf("The number %d is negative.",n);
        }
        else
        {
            System.out.print("The number 0 is zero.");
        }
    }
}