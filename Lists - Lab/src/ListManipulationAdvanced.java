import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!"end".equals(input))
        {
            String[] command = input.split(" ");
            String cmd = command[0];

            switch (cmd)
            {
                case "Contains":
                    int element = Integer.parseInt(command[1]);
                    if (numbers.contains(element))
                    {
                        System.out.print("Yes");
                    }
                    else
                    {
                        System.out.print("No such number");
                    }
                    break;

                case "Print":

                    if ("even".equals(command[1]))
                    {
                        numbers.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.print(e + " "));
                    }
                    else if ("odd".equals(command[1]))
                    {
                        numbers.stream().filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
                    }
                    break;
                case "Get":
                        numbers.stream().reduce((e1, e2) -> e1 + e2).ifPresent(System.out::print);
                    break;
                case "Filter":
                    String condition = command[1];
                    int num = Integer.parseInt(command[2]);

                    if ("<".equals(condition))
                    {
                        numbers.stream().filter(e -> e < num).forEach(e -> System.out.printf("%d ",e));
                    }
                    else if (">".equals(condition))
                    {
                        numbers.stream().filter(e -> e > num).forEach(e -> System.out.printf("%d ",e));
                    }
                    else if (">=".equals(condition))
                    {
                        numbers.stream().filter(e -> e >= num).forEach(e -> System.out.printf("%d ",e));
                    }
                    else if ("<=".equals(condition))
                    {
                        numbers.stream().filter(e -> e <= num).forEach(e -> System.out.printf("%d ",e));
                    }
                    break;
            }
            System.out.println();
            input = scanner.nextLine();
        }
    }
}