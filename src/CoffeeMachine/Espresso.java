package CoffeeMachine;

public class Espresso extends Coffee {
    public Espresso(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Espresso() {
        setName("Espresso");
    }
}
