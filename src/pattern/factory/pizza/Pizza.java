package pattern.factory.pizza;

import pattern.factory.ingredient.cheese.Cheese;
import pattern.factory.ingredient.clams.Clams;
import pattern.factory.ingredient.dough.Dough;
import pattern.factory.ingredient.pepperoni.Pepperoni;
import pattern.factory.ingredient.sauce.Sauce;
import pattern.factory.ingredient.veggies.Veggies;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
