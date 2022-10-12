import java.util.Scanner;
public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        getRectangleArea(a,b);
    }
    private static void getRectangleArea(int a, int b)
    {
        int area = a * b;
        System.out.println(area);
    }
}