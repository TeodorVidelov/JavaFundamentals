import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        String digit = "";

        for (int i = 0; i < countRotations; i++) {
            digit = array[0];

            for (int j = 1; j < array.length; j++) {

                array[j - 1] = array[j];
                array[j] = digit;
            }
        }
        System.out.print(String.join(" ",array));
    }
}