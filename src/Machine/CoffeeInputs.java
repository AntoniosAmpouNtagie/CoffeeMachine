package Machine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeInputs {
    Scanner scanner = new Scanner(System.in);
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int money = 550;

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }

    public void buy(int water, int coffeeBeans, int milk, int cups, int money) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = scanner.next();


        switch (type) {
            case ("1"):
                if (this.water < 250 || this.coffeeBeans < 16 || this.cups == 0) {
                    if (water < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (coffeeBeans < 16) {
                        System.out.println("not enough coffee beans");
                    } else System.out.println("not enough cups");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water = water - 250;
                    this.coffeeBeans -= 16;
                    this.cups -= 1;
                    this.money += 4;
                }
                break;
            case ("2"):
                if (this.water < 350 || this.milk < 100 || this.coffeeBeans < 20 || this.cups == 0) {
                    System.out.println("not enough resources");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 350;
                    this.milk -= 75;
                    this.coffeeBeans -= 20;
                    this.cups -= 1;
                    this.money += 7;
                }
                break;
            case ("3"):
                if (this.water < 200 || this.milk < 100 || this.coffeeBeans < 12 || this.cups == 0) {
                    System.out.println("not enough resources");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    this.water -= 200;
                    this.milk -= 100;
                    this.coffeeBeans -= 12;
                    this.cups -= 1;
                    this.money += 6;
                }
                break;
            case ("back"):
                break;
            default:
        }

    }

    public void fill(int water, int coffeeBeans, int milk, int cups) {
        System.out.println("Write how many ml of water you want to add:");
        water = scanner.nextInt();
        this.water += water;
        System.out.println("Write how many ml of milk you want to add:");
        milk = scanner.nextInt();
        this.milk += milk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans = scanner.nextInt();
        this.coffeeBeans += coffeeBeans;
        System.out.println("Write how many disposable cups you want to add:");
        cups = scanner.nextInt();
        this.cups += cups;


    }

    public void take(int money) {
        System.out.println("I gave you $" + money);
        this.money = 0;
        System.out.println();
    }


}
