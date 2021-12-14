package pattern.command.restaurant;

public class OrderSheet {

    Chef chef;

    public OrderSheet(Chef chef) {
        this.chef = chef;
    }

    public void orderUp() {
        chef.cook();
    }
}
