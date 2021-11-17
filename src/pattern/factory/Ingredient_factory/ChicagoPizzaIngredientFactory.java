package pattern.factory.Ingredient_factory;

import pattern.factory.ingredient.cheese.Cheese;
import pattern.factory.ingredient.cheese.MozzarellaCheese;
import pattern.factory.ingredient.clams.Clams;
import pattern.factory.ingredient.clams.FrozenClams;
import pattern.factory.ingredient.dough.Dough;
import pattern.factory.ingredient.dough.ThickCrustDough;
import pattern.factory.ingredient.pepperoni.Pepperoni;
import pattern.factory.ingredient.pepperoni.SlicedPepperoni;
import pattern.factory.ingredient.sauce.PlumTomatoSauce;
import pattern.factory.ingredient.sauce.Sauce;
import pattern.factory.ingredient.veggies.BlackOlive;
import pattern.factory.ingredient.veggies.Eggplant;
import pattern.factory.ingredient.veggies.Spinach;
import pattern.factory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Eggplant(), new Spinach(), new BlackOlive(), new BlackOlive()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
