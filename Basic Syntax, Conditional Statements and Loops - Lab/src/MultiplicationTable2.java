import java.util.Scanner;
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        if (input2 <= 10) {
            for (int i = input2; i <= 10; i++) {
                int n = input1;
                n = input1 * i;

                System.out.printf("%d X %d = %d\n", input1, i, n);
            }
        }
        else {
            System.out.printf("%d X %d = %d\n", input1, input2, input1 * input2);
        }
    }
}