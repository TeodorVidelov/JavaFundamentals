import java.util.Scanner;
public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        isPalindromeInteger(scanner,input);
    }
     private static void isPalindromeInteger(Scanner scanner, String input)
     {
         while (!"END".equals(input))
         {
             StringBuilder firstInput = new StringBuilder(input);
             StringBuilder reverseInput = new StringBuilder(input);

             reverseInput = reverseInput.reverse();

             if (firstInput.toString().equalsIgnoreCase(reverseInput.toString()))
             {
                 System.out.println("true");
             }
             else
             {
                 System.out.println("false");
             }
             input = scanner.nextLine();
         }
    }
}