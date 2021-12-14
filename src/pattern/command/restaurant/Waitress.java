package pattern.command.restaurant;

public class Waitress {

    OrderSheet orderSheet;

    public Waitress() {}

    public Waitress(OrderSheet orderSheet) {
        this.orderSheet = orderSheet;
    }

    public void setOrderSheet(OrderSheet orderSheet) {
        this.orderSheet = orderSheet;
    }

    public void orderUp() {
        orderSheet.orderUp();
    }
}
