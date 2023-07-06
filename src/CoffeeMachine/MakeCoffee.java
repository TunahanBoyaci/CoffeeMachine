package CoffeeMachine;

public class MakeCoffee {
    public Coffee makeCoffee (int coffeeNumber) {
        Coffee coffee;

        if (coffeeNumber == 1){
            return new Americano();
        }
        else if (coffeeNumber == 2){
            return new Espresso();
        }
        else if (coffeeNumber == 3){
            return new Cappuccino();
        }
        else if (coffeeNumber == 4){
            return new Latte();
        }
        else if (coffeeNumber == 5){
            return new Mocha();
        }
        else if (coffeeNumber == 6){
            return new Macchiato();
        }
        else if (coffeeNumber == 7){
            return new IcedCoffee();
        }
        else if (coffeeNumber == 8){
            return new Frappuccino();
        }
        else {
            return null;
        }
    }
}
