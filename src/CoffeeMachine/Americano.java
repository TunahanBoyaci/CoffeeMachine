package CoffeeMachine;

public class Americano extends Coffee {
    public Americano(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Americano() {
        setName("Americano");
    }
}