package CoffeeMachine;

public class Latte extends Coffee {
    public Latte(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Latte() {
        setName("Latte");
    }
}
