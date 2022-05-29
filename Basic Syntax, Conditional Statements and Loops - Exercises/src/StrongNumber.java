import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());

        int number = givenNumber;
        String nString = givenNumber + "";
        int aloneN = 0;

        int finalResult = 0;

        for (int i = 0; i < nString.length(); i++) {
            int firstResult = 1;
            aloneN = number % 10;
            number /= 10;
            for (int j = aloneN; j > 0; j--) {
                firstResult = firstResult * (j);
            }
            finalResult += firstResult;
        }
        if (finalResult == givenNumber){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}