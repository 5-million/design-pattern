package pattern.factory.store;

import pattern.factory.pizza.Pizza;
import pattern.factory.pizza.ny.NYStyleCheesePizza;
import pattern.factory.pizza.ny.NYStyleGreekPizza;
import pattern.factory.pizza.ny.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if(type.equals("greek"))
            pizza = new NYStyleGreekPizza();
        else if(type.equals("pepperoni"))
            pizza = new NYStylePepperoniPizza();

        return pizza;
    }
}
