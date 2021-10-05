package pattern.strategy.duck;

import pattern.strategy.behavior.fly.FlyNoWay;
import pattern.strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
