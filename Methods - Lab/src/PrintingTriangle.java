import java.util.Scanner;
public class PrintingTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++)
        {
            printLine(1,i);
        }

        for (int i = 1; i <= n - 1; i++)
        {
            printLine(1,n - i);
        }
    }

    private static void printLine(int start, int end){

        for (int i = start; i <= end; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}