import java.util.Arrays;
import java.util.Scanner;
public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split(""))
                .filter(s -> s.matches("\\d")) // skip all but "0", "1", ... , "9"
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(multiply(n));
    }
    private static int multiply(int[] a)
    {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                even += a[i];
            }
            else
            {
                odd += a[i];
            }
        }
        return even * odd;
    }
}