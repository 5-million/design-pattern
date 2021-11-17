package pattern.factory.pizza;

import pattern.factory.Ingredient_factory.PizzaIngredientFactory;

public class GreekPizza extends Pizza {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    public GreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

    }
}
