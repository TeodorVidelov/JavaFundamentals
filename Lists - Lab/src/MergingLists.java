import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = Math.min(firstList.size(),secondList.size());

        for (int i = 0; i < size; i++) {
            System.out.printf("%d %d ", firstList.get(i), secondList.get(i));
        }
        printTheRestNumbers(firstList,size);
        printTheRestNumbers(secondList,size);
    }
    private static void printTheRestNumbers (List<Integer> numbers, int startIndex)
    {
        for (int i = startIndex; i < numbers.size(); i++)
        {
            System.out.printf("%d ",numbers.get(i));
        }
    }
}