import java.util.Scanner;
public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers =Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
    }
}