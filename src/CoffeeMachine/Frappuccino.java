package CoffeeMachine;

public class Frappuccino extends Coffee {
    public Frappuccino(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        super(name, coffeeSize, milk, sugarCubes);
    }

    public Frappuccino() {
        setName("Frappuccino");
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
