package pattern.factory;

import pattern.factory.store.ChicagoPizzaStore;
import pattern.factory.store.NYPizzaStore;
import pattern.factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
//        NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
//        PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
//        nyStore.orderPizza("Cheese");

//        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
//        PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);
//        chicagoStore.orderPizza("Cheese");


        // 팩토리 메소드 패턴을 적용한 피자 주문
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("cheese");
    }
}
