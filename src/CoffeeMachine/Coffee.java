package CoffeeMachine;

public class Coffee {
    private String name;
    private CoffeeSize coffeeSize;
    private boolean milk = false;
    private int sugarCubes;

    public Coffee(String name, CoffeeSize coffeeSize, boolean milk, int sugarCubes) {
        this.name = name;
        this.coffeeSize = coffeeSize;
        this.milk = milk;
        this.sugarCubes = sugarCubes;
    }

    public Coffee() {
        this.name = "No name";
        this.coffeeSize = CoffeeSize.SMALL;
        this.milk = false;
        this. sugarCubes = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public int getSugarCubes() {
        return sugarCubes;
    }

    public void setSugarCubes(int sugarCubes) {
        this.sugarCubes = sugarCubes;
    }

    @Override
    public String toString() {
        String milk;
        if (this.milk){
            milk = "with milk";
        }
        else {
            milk = "without milk";
        }

        return name + "\n"
                + coffeeSize + "\n"
                + milk + "\n"
                + sugarCubes + " sugar cubes";
    }
}