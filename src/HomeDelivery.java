import java.time.LocalDateTime;

public class HomeDelivery extends Order{
    private String address;
    private double distanceToRestaurant;
    private LocalDateTime deliveryWanted;

    public HomeDelivery(Order order,String address, double distanceToRestaurant, LocalDateTime deliveryWanted) {
        super(order);
        this.address = address;
        this.distanceToRestaurant = distanceToRestaurant;
        this.deliveryWanted = deliveryWanted;
    }

    public String getAddress() {
        return address;
    }

    public double getDistanceToRestaurant() {
        return distanceToRestaurant;
    }

    public double totalPrice() {
        double total = 0;
        for (MenuItem menuItem : getOrders()) {
            total += menuItem.getPrice();
        }

        return total;
    }


}
