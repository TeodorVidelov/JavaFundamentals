import java.util.Scanner;
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] a = new String[n];
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split(" ");

            if (i % 2 == 0){
                a[i] = array[0];
                b[i] = array[1];
            }
            else {
                a[i] = array[1];
                b[i] = array[0];
            }
        }
        System.out.print(String.join(" ",a));
        System.out.println();
        System.out.print(String.join(" ",b));
    }
}
