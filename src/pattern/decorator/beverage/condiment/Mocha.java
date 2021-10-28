package pattern.decorator.beverage.condiment;

import pattern.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " add Mocha";
    }
}
