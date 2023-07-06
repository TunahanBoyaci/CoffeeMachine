package CoffeeMachine;

public class Mocha extends Coffee {
    public Mocha(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Mocha() {
        setName("Mocha");
    }
}