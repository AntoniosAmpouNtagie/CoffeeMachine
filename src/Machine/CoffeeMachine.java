package Machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoffeeInputs inputs = new CoffeeInputs();


        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String choice = scanner.next();
        while (!choice.equals("exit")) {
            switch (choice) {
                case ("buy") ->
                        inputs.buy(inputs.getWater(), inputs.getMilk(), inputs.getCoffeeBeans(), inputs.getCups(), inputs.getMoney());
                case ("fill") ->
                        inputs.fill(inputs.getWater(), inputs.getMilk(), inputs.getCoffeeBeans(), inputs.getCups());
                case ("take") -> inputs.take(inputs.getMoney());
                case ("remaining") -> {
                    System.out.println("The coffee machine has:");
                    System.out.println(inputs.getWater() + " ml of water");
                    System.out.println(inputs.getMilk() + " ml of milk");
                    System.out.println(inputs.getCoffeeBeans() + " g of coffee beans");
                    System.out.println(inputs.getCups() + " disposable cups");
                    System.out.println("$" + inputs.getMoney() + " of money");
                    System.out.println();
                }
                default -> {
                }
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            choice = scanner.next();

        }


    }


}
