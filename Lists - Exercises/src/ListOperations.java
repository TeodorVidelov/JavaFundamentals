import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"End".equals(input))
        {
            String[] command = input.split(" ");

            if ("Add".equals(command[0]))
            {
                int number = Integer.parseInt(command[1]);
                numbers.add(number);
            }
            else if ("Insert".equals(command[0]))
            {
                int number = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                if (index > numbers.size() || index < 0)
                {
                    System.out.println("Invalid index");
                }
                else
                {
                    numbers.add(index, number);
                }
            }
            else if ("Remove".equals(command[0]))
            {
                int index = Integer.parseInt(command[1]);

                if (index > numbers.size() || index < 0)
                {
                    System.out.println("Invalid index");
                }
                else
                {
                    numbers.remove(index);
                }
            }
            else if ("left".equals(command[1]))
            {
                int countRotations = Integer.parseInt(command[2]);

                Collections.rotate(numbers,-countRotations);
            }
            else if ("right".equals(command[1]))
            {
                int countRotations = Integer.parseInt(command[2]);

                Collections.rotate(numbers,countRotations);
            }
            input = scanner.nextLine();
        }
        numbers.forEach(e -> System.out.printf("%d ",e));
    }
}