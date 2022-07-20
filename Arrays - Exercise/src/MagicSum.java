import java.util.Arrays;
import java.util.Scanner;
public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int b = array[j];

                if (a + b == magicSum){
                    System.out.printf("%d %d\n",a,b);
                }
            }
        }
    }
}