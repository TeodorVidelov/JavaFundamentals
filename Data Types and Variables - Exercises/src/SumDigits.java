import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < n.length(); i++)
        {
            sum += n.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}