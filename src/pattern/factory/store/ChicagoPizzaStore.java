package pattern.factory.store;

import pattern.factory.Ingredient_factory.ChicagoPizzaIngredientFactory;
import pattern.factory.Ingredient_factory.PizzaIngredientFactory;
import pattern.factory.pizza.CheesePizza;
import pattern.factory.pizza.GreekPizza;
import pattern.factory.pizza.PepperoniPizza;
import pattern.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if(type.equals("greek")) {
            pizza = new GreekPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Greek Pizza");
        }
        else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
