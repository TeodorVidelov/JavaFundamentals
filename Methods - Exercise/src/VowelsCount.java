import java.util.Scanner;
public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(countVowels(input));

    }
    private static int countVowels (String input)
    {
        Scanner scanner = new Scanner(System.in);
        String[] text = input.split("");
        int countVowels = 0;
        for (int i = 0; i < text.length; i++)
        {
            if ("a".equalsIgnoreCase(text[i]))
            {
                countVowels++;
            }
            else if ("e".equalsIgnoreCase(text[i]))
            {
                countVowels++;
            }
            else if ("i".equalsIgnoreCase(text[i]))
            {
                countVowels++;
            }
            else if ("o".equalsIgnoreCase(text[i]))
            {
                countVowels++;
            }
            else if ("u".equalsIgnoreCase(text[i]))
            {
                countVowels++;
            }
            else if ("y".equalsIgnoreCase(text[i]))
            {
                countVowels++;
            }
        }
        return countVowels;
    }
}