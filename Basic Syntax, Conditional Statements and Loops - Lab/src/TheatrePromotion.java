import java.util.Scanner;
public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());

        int price = 0;
        if ("Weekday".equals(typeOfDay)){
            if ((ageOfPerson >= 0 && ageOfPerson <= 18) || (ageOfPerson > 64 && ageOfPerson <= 122)){
                price = 12;
            }
            else if (ageOfPerson > 18 && ageOfPerson <= 64){
                price = 18;
            }
        }
        else if ("Weekend".equals(typeOfDay)){
            if ((ageOfPerson >= 0 && ageOfPerson <=18) || (ageOfPerson > 64 && ageOfPerson <= 122)){
                price = 15;
            }
            else if (ageOfPerson > 18 && ageOfPerson <= 64){
                price = 20;
            }
        }
        else if ("Holiday".equals(typeOfDay)){
            if (ageOfPerson >= 0 && ageOfPerson <=18){
                price = 5;
            }
            else if (ageOfPerson > 18 && ageOfPerson <= 64){
                price = 12;
            }
            else if (ageOfPerson > 64 && ageOfPerson <= 122){
                price = 10;
            }
        }
        if (price != 0){
            System.out.printf("%d$",price);
        }
        else {
            System.out.print("Error!");
        }
    }
}