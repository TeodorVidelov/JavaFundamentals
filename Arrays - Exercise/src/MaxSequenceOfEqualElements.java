import java.util.Arrays;
import java.util.Scanner;
public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int longestSequence = 0;
        int countSequence = 1;
        int sequenceIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            String currentElement = array[i];
            if (!currentElement.equals(array[i + 1])){
                countSequence = 1;
            }
            else {
                countSequence++;
                if (countSequence > longestSequence){
                    longestSequence = countSequence;
                    sequenceIndex = i;
                }
            }
        }
        for (int i = 0; i < longestSequence; i++) {
            System.out.printf("%s ",array[sequenceIndex]);
        }
    }
}