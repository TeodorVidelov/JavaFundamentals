import java.util.Scanner;
public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String character = scanner.nextLine();

        if (character.equals(character.toLowerCase()))
        {
            System.out.printf("lower-case");
        }
        else
        {
            System.out.printf("upper-case");
        }
    }
}