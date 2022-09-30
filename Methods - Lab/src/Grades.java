import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        grades(grade);
    }
    private static void grades (double n)
    {
        if (n >= 2 && n <= 2.99)
        {
            System.out.print("Fail");
        }
        else if (n >= 3 && n <= 3.49)
        {
            System.out.print("Poor");
        }
        else if (n >= 3.50 && n <= 4.49)
        {
            System.out.print("Good");
        }
        else if (n >= 4.50 && n <= 5.49)
        {
            System.out.print("Very good");
        }
        else if (n >= 5.50 && n <= 6)
        {
            System.out.print("Excellent");
        }
    }
}
