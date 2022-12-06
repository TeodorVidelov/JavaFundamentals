import java.util.Scanner;
public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(sumOfN1AndN2(n1,n2) - subtractN3(n3));

    }
    private static int sumOfN1AndN2 (int n1, int n2)
    {
        return n1 + n2;
    }
    private static int subtractN3 (int n3)
    {
        return n3;
    }
}