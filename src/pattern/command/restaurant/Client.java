package pattern.command.restaurant;

public class Client {

    public static void main(String[] args) {
        Chef chef = new Chef();
        OrderSheet orderSheet = new OrderSheet(chef);

        orderSheet.orderUp();
    }
}
