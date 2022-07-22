package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        final String[] msgs = {"ml of water the coffee machine has:",
                "ml of milk the coffee machine has:",
                "grams of coffee beans the coffee machine has:",
                "cups of coffee you will need:"};
        Scanner scanner = new Scanner(System.in);
        final int[] base = {200, 50, 15};
        int[] countOfIngredient = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Write how many " + msgs[i]);
            countOfIngredient[i] = scanner.nextInt() / base[i];
        }
        Arrays.sort(countOfIngredient);
        int minimumCountOfCups = countOfIngredient[0];

        System.out.println("Write how many " + msgs[3]);
        int countOfCups = scanner.nextInt();
        if (minimumCountOfCups > countOfCups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n",
                    minimumCountOfCups - countOfCups);
        } else if (minimumCountOfCups == countOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", minimumCountOfCups);
        }

    }
}
