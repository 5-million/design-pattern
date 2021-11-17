package pattern.factory.pizza;

import pattern.factory.Ingredient_factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

    }
}
