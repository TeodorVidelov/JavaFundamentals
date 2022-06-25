import java.util.Scanner;
import java.util.Arrays;
public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        int[] firstNumber = new int[firstArray.length];
        String[] secondArray = scanner.nextLine().split(" ");
        int[] secondNumber = new int[secondArray.length];

        int sumFirst = 0;
        int diff = 0;
        int position = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstNumber[i] = Integer.parseInt(firstArray[i]);
            secondNumber[i] = Integer.parseInt(secondArray[i]);
            if (firstNumber[i] != secondNumber[i]){
                diff++;
                position = i;
                break;
            }
            sumFirst += firstNumber[i];
        }
        if (diff == 0){
            System.out.printf("Arrays are identical. Sum: %d",sumFirst);
        }
        else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",position);
        }
    }
}