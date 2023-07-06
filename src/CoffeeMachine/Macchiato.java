package CoffeeMachine;

public class Macchiato extends Coffee {
    public Macchiato(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Macchiato() {
        setName("Macchiato");
    }
}