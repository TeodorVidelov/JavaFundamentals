import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.nextLine().split(" ");
        String[] b = scanner.nextLine().split(" ");

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (b[i].equals(a[j])){
                    System.out.printf("%s ",b[i]);
                }
            }
        }
    }
}