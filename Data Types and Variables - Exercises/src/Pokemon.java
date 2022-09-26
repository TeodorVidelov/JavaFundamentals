import java.util.Scanner;
public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargetsM = Integer.parseInt(scanner.nextLine());
        int theExhaustionFactorY  = Integer.parseInt(scanner.nextLine());

        double pokePowerEqualsTheExhaustionFactorY = pokePowerN * 0.50;

        int countTargets = 0;
        while (pokePowerN >= distanceBetweenTargetsM)
        {
            pokePowerN -= distanceBetweenTargetsM;
            countTargets++;
            if (pokePowerN == pokePowerEqualsTheExhaustionFactorY && theExhaustionFactorY != 0)
            {
            pokePowerN /= theExhaustionFactorY;
            }
        }

        System.out.println(pokePowerN);
        System.out.println(countTargets);
    }
}