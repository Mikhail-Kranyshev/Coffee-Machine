package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    static final String[] msgs = {"Write how many ml of water you want to add:",
            "Write how many ml of milk you want to add:",
            "Write how many grams of coffee beans you want to add:",
            "Write how many disposable cups of coffee you want to add:"};
    static int[] coffeeMachine = {400, 540, 120, 9, 550};
    public static void print(int[] inventory) {
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                \n""", inventory[0], inventory[1], inventory[2], inventory[3], inventory[4]);
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
        System.out.println();
        print(coffeeMachine);
    }

    public static void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                coffeeMachine[0] -= 250;
                coffeeMachine[2] -= 16;
                coffeeMachine[3]--;
                coffeeMachine[4] += 4;
                break;
            case 2:
                coffeeMachine[0] -= 350;
                coffeeMachine[1] -= 75;
                coffeeMachine[2] -= 20;
                coffeeMachine[3]--;
                coffeeMachine[4] += 7;
                break;
            case 3:
                coffeeMachine[0] -= 200;
                coffeeMachine[1] -= 100;
                coffeeMachine[2] -= 12;
                coffeeMachine[3]--;
                coffeeMachine[4] += 6;
                break;
        }
    }

    public static void fill() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < msgs.length; i++) {
            System.out.println(msgs[i]);
            coffeeMachine[i] += scanner.nextInt();
        }
    }

    public static void take() {
        System.out.println("I gave you $" + coffeeMachine[4]);
        coffeeMachine[4] = 0;
    }

    public static void main(String[] args) {
        print(coffeeMachine);
        menu();
    }
}
