package Task1.Model;

public class Order {
    private final String clientName;
    private final String product;
    private final int quantity;
    private final int price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = qnt;
        this.price = price;
    }
}
