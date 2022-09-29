import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());


        if ("+".equals(operator))
        {
            add(a,b);
        }
        else if ("*".equals(operator))
        {
            multiply(a,b);
        }
        else if ("/".equals(operator))
        {
            divide(a,b);
        }
        else if ("-".equals(operator))
        {
            subtract(a,b);
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
    private static void divide(int a, int b)
    {
        System.out.println(a / b);
    }
    private static void subtract (int a, int b)
    {
        System.out.println(a - b);
    }
}