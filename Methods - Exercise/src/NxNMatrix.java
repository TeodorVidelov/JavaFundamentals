import java.util.Scanner;
public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        Matrix(input);

    }
    private static int Matrix (int input)
    {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.printf("%d ",input);
            }
            System.out.println();
        }
        return input;
    }
}