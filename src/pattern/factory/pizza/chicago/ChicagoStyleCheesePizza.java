package pattern.factory.pizza.chicago;

import pattern.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    /**
     * 추상 팩토리 패턴 적용전 코드
     */
//    public ChicagoStyleCheesePizza() {
//        name = "Chicago Style Deep dish Cheese Pizza";
//        dough = "Extra Thick Crust Dough";
//        sauce = "Plum Tomato Sauce";
//        toppings.add("Shredded Mozzarella Cheese");
//    }

    @Override
    public void cut() {
        System.out.println("cutting the pizza into square slices");
    }

    /**
     * 오류 제거용 코드
     */
    @Override
    public void prepare() {
    }
}
