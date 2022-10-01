import java.util.Scanner;
public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if ("string".equals(input))
        {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String max = getMax(first,second);
            System.out.print(max);
        }
        else if ("int".equals(input))
        {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int max = getMax(first,second);
            System.out.println(max);
        }
        else if ("char".equals(input))
        {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            char max = getMax(first,second);
            System.out.print(max);
        }
    }
    private static int getMax(int first,int second)
    {
        if (first > second)
        {
            return first;
        }
        return second;

    }
    private static char getMax (char first, char second)
    {
        if (first > second)
        {
            return first;
        }
        return second;

    }
    private static String getMax (String first, String second)
    {
        if (first.compareTo(second) >= 0)
        {
            return first;
        }
        return second;
    }
}