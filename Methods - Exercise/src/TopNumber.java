import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isTop = false;
        for (int i = 1; i <= n; i++) {
            isTop = printTopNumbers(i);
            if (isTop) {
                System.out.println(i);
            }
        }
    }

    private static boolean printTopNumbers(int n) {
        int sumOfDigits = 0;
        int oddDigits = 0;
        while (n > 0) {
            sumOfDigits += n % 10;
            if ((n % 10) % 2  != 0) {
                oddDigits++;
            }
            n /= 10;
        }
        if (sumOfDigits % 8 == 0 && oddDigits > 0) {
            return true;
        }
        return  false;
    }
}

