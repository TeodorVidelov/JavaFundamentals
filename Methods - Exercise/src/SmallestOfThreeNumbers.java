import java.util.Scanner;
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = new int[3];

        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
        arrayOfNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(smallestNumbers(arrayOfNumbers));
    }
    private static int smallestNumbers(int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}