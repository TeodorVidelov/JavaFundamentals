import java.util.Scanner;
public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startASCII = Integer.parseInt(scanner.nextLine());
        int endASCII = Integer.parseInt(scanner.nextLine());

        for (int i = startASCII; i <= endASCII; i++)
        {
            char character = (char)i;
            System.out.print(character + " ");
        }
    }
}