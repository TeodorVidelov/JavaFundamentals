import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        int loggingAttemptCount = 1;
        String input = scanner.nextLine();

        while (!input.equals(password) && loggingAttemptCount++ < 4){
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (input.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
        else {
            System.out.printf("User %s blocked!",username);
        }
    }
}