import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        String password = scanner.nextLine();

        if (!isEnoughCharacters(password))
        {
            isValid = false;
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLettersAndDigits(password))
        {
            isValid = false;
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveALeastTwoDigits(password))
        {
            isValid = false;
            System.out.println("Password must have at least 2 digits");
        }
        if (isValid)
        {
            System.out.println("Password is valid");
        }

    }
    private static boolean isEnoughCharacters(String password)
    {
        if (password.length() < 6 || password.length() > 10)
        {
            return false;
        }
        return true;
    }
    private static boolean onlyLettersAndDigits (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
        char symbol = password.charAt(i);
            if (!(symbol >= 'A' && symbol <= 'Z' || symbol  >= 'a' && symbol <= 'z' || symbol >= '0' && symbol <= '9'))
            {
                return false;
            }
         }
        return true;
    }
    private static boolean haveALeastTwoDigits (String password)
    {
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            char symbols = password.charAt(i);
            if (symbols >= '0' && symbols <= '9')
            {
                count++;
            }
        }
        if (count >= 2)
        {
            return true;
        }
        else {
            return false;
        }
    }
}