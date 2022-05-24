import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        switch (typeOfGroup){
            case "Students":
                    if ("Friday".equals(dayOfWeek)){
                    price = 8.45;
                    }
                    else if ("Saturday".equals(dayOfWeek)){
                    price = 9.80;
                    }
                    else if ("Sunday".equals(dayOfWeek)){
                    price = 10.46;
                    }
                break;
            case "Business":
                    if ("Friday".equals(dayOfWeek)){
                        price = 10.90;
                    }
                    else if ("Saturday".equals(dayOfWeek)){
                        price = 15.60;
                    }
                    else if ("Sunday".equals(dayOfWeek)){
                        price = 16;
                    }
                break;
            case "Regular":
                    if ("Friday".equals(dayOfWeek)){
                        price = 15;
                    }
                    else if ("Saturday".equals(dayOfWeek)){
                        price = 20;
                    }
                    else if ("Sunday".equals(dayOfWeek)){
                        price = 22.50;
                    }
                break;
        }
        double totalPrice = price * groupOfPeople;

        if ("Students".equals(typeOfGroup) && groupOfPeople >= 30){
            totalPrice *= 0.85;
        }
        if ("Business".equals(typeOfGroup) && groupOfPeople >= 100){
            totalPrice = (groupOfPeople - 10) * price;
        }
        if ("Regular".equals(typeOfGroup) && groupOfPeople >= 10 && groupOfPeople <= 20){
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}