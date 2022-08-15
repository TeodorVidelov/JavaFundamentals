import java.util.Scanner;
public class CircleAreaPrecision12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.12f",Math.PI * radius * radius);
    }
}