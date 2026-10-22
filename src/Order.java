import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Order {
    private int id;
    private int lastOrderId;
    private final ArrayList<MenuItem> menuitems = new ArrayList<>();

    private LocalDateTime orderPlaced;

    public Order(Order order) {
    }

    public Order(int id, int lastOrderId) {
        this.id = id;
        this.lastOrderId = lastOrderId;
    }

    public ArrayList<MenuItem> getOrders() {
        return menuitems;
    }

    public void addMenuItems(MenuItem menuItem) {
        menuitems.add(menuItem);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getOrderPlaced() {
        return orderPlaced;
    }

    public abstract double totalPrice();

    @Override
    public String toString() {
        return menuitems.toString();
    }
}
