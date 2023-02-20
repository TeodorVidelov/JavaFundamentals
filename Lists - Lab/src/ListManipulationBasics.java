import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input))
        {
            String[] command = input.split(" ");

            if ("Add".equals(command[0]))
            {
                int addedNumber = Integer.parseInt(command[1]);
                numbers.add(addedNumber);
            }
            else if ("Remove".equals(command[0]))
            {
                int removedNumber = Integer.parseInt(command[1]);
                numbers.remove(Integer.valueOf(removedNumber));
            }
            else if ("RemoveAt".equals(command[0]))
            {
                int removeIndex = Integer.parseInt(command[1]);
                numbers.remove(removeIndex);
            }
            else if ("Insert".equals(command[0]))
            {
                int  numberToInsert = Integer.parseInt(command[1]);
                int indexToInsert = Integer.parseInt(command[2]);

                numbers.add(indexToInsert, numberToInsert);
            }
            input = scanner.nextLine();
        }
        numbers.forEach(e -> System.out.printf("%d ",e));
    }
}