import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if ("add".equals(command))
        {
            add(a,b);
        }
        else if ("multiply".equals(command))
        {
            multiply(a,b);
        }
        else if ("subtract".equals(command))
        {
            subtract(a,b);
        }
        else if ("divide".equals(command))
        {
            divide(a,b);
        }
    }

    private static void add(int a, int b)
    {
        System.out.println(a + b);
    }
    private static void multiply(int a, int b)
    {
        System.out.println(a * b);
    }
    private static void subtract(int a, int b)
    {
        System.out.println(a - b);
    }
    private static void divide(int a, int b)
    {
        System.out.println(a / b);
    }
}