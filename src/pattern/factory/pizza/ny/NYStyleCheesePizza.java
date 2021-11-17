package pattern.factory.pizza.ny;

import pattern.factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    /**
     * 추상 팩토리 패턴 적용 전 코드
     */
//    public NYStyleCheesePizza() {
//        name = "NY style Sauce and Cheese Pizza";
//        dough = "Thin Crust Dough";
//        sauce = "Marinara Sauce";
//        toppings.add("Grated Reggiano Cheese");
//    }


    /**
     * 오류 제거용 코드
     */
    @Override
    public void prepare() {
    }
}
