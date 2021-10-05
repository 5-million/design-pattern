package pattern.strategy.duck;

import pattern.strategy.behavior.fly.FlyWithWings;
import pattern.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
