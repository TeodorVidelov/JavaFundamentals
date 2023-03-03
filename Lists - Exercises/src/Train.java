import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!"end".equals(input))
        {
            String[] command = input.split(" ");

            if ("Add".equals(command[0]))
            {
                listOfWagons.add(Integer.valueOf(command[1]));
            }
            else
            {
                int passengersToFitInWagon = Integer.parseInt(command[0]);
                for (int i = 0; i < listOfWagons.size(); i++)
                {
                    int sum = passengersToFitInWagon + listOfWagons.get(i);
                    if (sum <= maxCapacityOfEachWagon)
                    {
                        listOfWagons.set(i, sum);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        listOfWagons.forEach(e -> System.out.printf("%d ",e));
    }
}