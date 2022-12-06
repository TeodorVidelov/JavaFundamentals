import java.util.Scanner;
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(middleOfCharacter(input));

    }
    private static String middleOfCharacter(String input)
    {
        if (input.length() % 2 != 0)
        {
            return String.format("%s",input.charAt(input.length() / 2));
        }
        else
        {
            return String.format("%s%s",input.charAt(input.length() / 2 -1),input.charAt(input.length() / 2));
        }
    }
}