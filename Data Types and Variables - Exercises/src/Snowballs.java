import java.math.BigInteger;
import java.util.Scanner;
public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowBalls = Integer.parseInt(scanner.nextLine());

        long highestValue = 0;
        double snow = 0;
        double time = 0;
        double quality = 0;
        double value = 0;

        for (int i = 0; i < numberOfSnowBalls; i++) {
            double snowballSnow = Double.parseDouble(scanner.nextLine());
            double snowballTime = Double.parseDouble(scanner.nextLine());
            double snowballQuality = Double.parseDouble(scanner.nextLine());

            long snowballValue = Math.round(Math.pow((snowballSnow / snowballTime ), snowballQuality));

            if (snowballValue > highestValue){
                highestValue = snowballValue;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
                value = snowballValue;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)",snow,time,value,quality);
    }
}