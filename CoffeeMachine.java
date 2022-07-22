package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int countOfCups = scanner.nextInt();
        int countOfWater = countOfCups * 200;
        int countOfMilk = countOfCups * 50;
        int countOfCoffeeBeans = countOfCups * 15;
        System.out.printf("""
                For %d cups of coffee you will need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans""",
                countOfCups, countOfWater, countOfMilk, countOfCoffeeBeans);
    }
}
