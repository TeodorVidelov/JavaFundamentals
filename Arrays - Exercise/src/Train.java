import java.util.Scanner;
public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[countWagons];
        int totalPeople = 0;
        for (int i = 0; i < countWagons; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInWagon;
            wagons[i] = peopleInWagon;
            System.out.print(wagons[i] + " ");
        }
        System.out.println();
        System.out.println(totalPeople);
    }
}