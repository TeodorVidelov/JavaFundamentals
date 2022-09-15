import java.util.Scanner;
public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        double biggestKeg = 0;
        String biggestModel = "";
        for (int i = 0; i < countKegs; i++)
        {
            String modelOfKeg = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volumeOfKeg = Math.PI * radius * radius * height;

            if (volumeOfKeg > biggestKeg)
            {
                biggestKeg = volumeOfKeg;
                biggestModel = modelOfKeg;
            }
        }
        System.out.println(biggestModel);
    }
}