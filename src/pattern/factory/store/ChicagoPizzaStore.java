package pattern.factory.store;

import pattern.factory.pizza.Pizza;
import pattern.factory.pizza.chicago.ChicagoStyleCheesePizza;
import pattern.factory.pizza.chicago.ChicagoStyleGreekPizza;
import pattern.factory.pizza.chicago.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        else if(type.equals("greek"))
            pizza = new ChicagoStyleGreekPizza();
        else if(type.equals("pepperoni"))
            pizza = new ChicagoStylePepperoniPizza();

        return pizza;
    }
}
