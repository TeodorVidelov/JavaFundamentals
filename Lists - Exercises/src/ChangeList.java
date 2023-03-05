import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"end".equals(input))
        {
            String[] command = input.split(" ");

            if ("Delete".equals(command[0]))
            {
                int element = Integer.parseInt(command[1]);

                for (int i = 0; i < numbers.size(); i++)
                {
                    if (numbers.get(i).equals(element))
                    {
                        numbers.remove(numbers.get(i));
                    }
                }
            }
            else if ("Insert".equals(command[0]))
            {
                int element = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);
                numbers.add(position,element);
            }
            input = scanner.nextLine();
        }
        numbers.forEach(e -> System.out.printf("%d ",e));
    }
}
