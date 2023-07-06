package CoffeeMachine;

public class Cappuccino extends Coffee {
    public Cappuccino(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Cappuccino() {
        setName("Cappuccino");
    }
}
