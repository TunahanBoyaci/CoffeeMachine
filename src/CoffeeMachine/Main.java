package CoffeeMachine;

import com.sun.management.ThreadMXBean;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee;

        System.out.println("Welcome to Coffee Machine");

        while (true) {
            System.out.println("Press [0] to exit");
            System.out.println("Press [1] for Americano");
            System.out.println("Press [2] for Espresso");
            System.out.println("Press [3] for Cappuccino");
            System.out.println("Press [4] for Latte");
            System.out.println("Press [5] for Mocha");
            System.out.println("Press [6] for Macchiato");
            System.out.println("Press [7] for Iced Coffee");
            System.out.println("Press [8] for Frappuccino");

            int coffeeNumber = scanner.nextInt();

            if (coffeeNumber == 0){
                System.out.println("Exiting...");
                break;
            }
            else {
                MakeCoffee makeCoffee = new MakeCoffee();
                coffee = makeCoffee.makeCoffee(coffeeNumber);
            }

            if (coffee == null){
                System.out.println("Please enter valid coffee number");
            }
            else {
                // Name
                System.out.println("You have selected " + "{" + coffee.getName() + "}");

                // Size
                System.out.println("Please select size of the coffee from the menu below: ");
                System.out.println(CoffeeSize.SMALL);
                System.out.println(CoffeeSize.MEDIUM);
                System.out.println(CoffeeSize.LARGE);
                System.out.println(CoffeeSize.XLARGE);

                scanner.nextLine(); // dummy
                String option = scanner.nextLine();

                if (option.equalsIgnoreCase("SMALL")){
                    coffee.setCoffeeSize(CoffeeSize.SMALL);
                }
                else if (option.equalsIgnoreCase("MEDIUM")){
                    coffee.setCoffeeSize(CoffeeSize.MEDIUM);
                }
                else if (option.equalsIgnoreCase("LARGE")){
                    coffee.setCoffeeSize(CoffeeSize.LARGE);
                }
                else if (option.equalsIgnoreCase("XLARGE")){
                    coffee.setCoffeeSize(CoffeeSize.MEDIUM);
                }
                else {
                    System.out.println("Invalid size!");
                }

                System.out.println("Your " + coffee.getCoffeeSize() + " " + coffee.getName() + " is being prepared...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                // Milk
                System.out.println("Would you like to add milk to your coffee? Yes / No");
                option = scanner.nextLine();
                if (option.equalsIgnoreCase("Yes")){
                    System.out.println("Milk is being added...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    coffee.setMilk(true);
                }
                else {
                    System.out.println("Your " + coffee.getName() + " is prepared without milk");
                }

                // Sugar
                System.out.println("Would you like any sugar to your coffee? Yes / No");
                option = scanner.nextLine();
                if (option.equalsIgnoreCase("Yes")){
                    System.out.println("How many sugar cube would you like?");
                    int sugarCubes = scanner.nextInt();
                    System.out.println("Cubes are being added...");

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    coffee.setSugarCubes(sugarCubes);
                    System.out.println(sugarCubes + " cube of sugar has been added to your coffee");
                    scanner.nextLine(); // dummy
                }
                else {
                    System.out.println("Your coffee is being prepared without sugar…");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Your coffee has been prepared!");
                System.out.println(coffee);
            }
        }
    }
}
