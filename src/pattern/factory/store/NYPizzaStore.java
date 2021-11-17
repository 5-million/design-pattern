package pattern.factory.store;

import pattern.factory.Ingredient_factory.NYPizzaIngredientFactory;
import pattern.factory.Ingredient_factory.PizzaIngredientFactory;
import pattern.factory.pizza.CheesePizza;
import pattern.factory.pizza.GreekPizza;
import pattern.factory.pizza.PepperoniPizza;
import pattern.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type.equals("greek")) {
            pizza = new GreekPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Greek Pizza");
        }
        else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
