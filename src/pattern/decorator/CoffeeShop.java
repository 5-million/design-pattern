package pattern.decorator;

import pattern.decorator.beverage.Beverage;
import pattern.decorator.beverage.DarkRoast;
import pattern.decorator.beverage.condiment.Mocha;
import pattern.decorator.beverage.condiment.Whip;

public class CoffeeShop {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
