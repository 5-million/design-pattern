package pattern.factory.Ingredient_factory;

import pattern.factory.ingredient.cheese.Cheese;
import pattern.factory.ingredient.cheese.ReggianoCheese;
import pattern.factory.ingredient.clams.Clams;
import pattern.factory.ingredient.clams.FreshClams;
import pattern.factory.ingredient.dough.Dough;
import pattern.factory.ingredient.dough.ThinCrustDough;
import pattern.factory.ingredient.pepperoni.Pepperoni;
import pattern.factory.ingredient.pepperoni.SlicedPepperoni;
import pattern.factory.ingredient.sauce.MarinaraSauce;
import pattern.factory.ingredient.sauce.Sauce;
import pattern.factory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
