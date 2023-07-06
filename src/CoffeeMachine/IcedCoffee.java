package CoffeeMachine;

public class IcedCoffee extends Coffee {
    public IcedCoffee(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public IcedCoffee() {
        setName("IcedCoffee");
    }

    @Override
    public String toString() {
        System.out.println("Best way to cool off in a hot summer day… Perfect decision!");

        String milk;
        if (super.isMilk()){
            milk = "with milk";
        }
        else {
            milk = "without milk";
        }

        return super.getName() + "\n"
                + super.getCoffeeSize() + "\n"
                + milk + "\n"
                + super.getSugarCubes() + " sugar cubes";
    }
}
