package pattern.factory.pizza_factory;

import pattern.factory.pizza.Pizza;

public interface PizzaFactory {

    Pizza createPizza(String type);
}
