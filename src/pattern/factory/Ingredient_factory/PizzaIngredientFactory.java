package pattern.factory.Ingredient_factory;

import pattern.factory.ingredient.cheese.Cheese;
import pattern.factory.ingredient.clams.Clams;
import pattern.factory.ingredient.dough.Dough;
import pattern.factory.ingredient.pepperoni.Pepperoni;
import pattern.factory.ingredient.sauce.Sauce;
import pattern.factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
