import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        MenuItem menuitem = new MenuItem("test", 3333);
        MenuItem menuitem2 = new MenuItem("test2", 33);

        Order order = new Order(1, 2) {
            @Override
            public double totalPrice() {
                return 0;
            }
        };


        HomeDelivery homeDelivery = new HomeDelivery(
                order, "skanderborg", 3, LocalDate.now().atStartOfDay()
        );
        homeDelivery.addMenuItems(menuitem);
        homeDelivery.addMenuItems(menuitem2);
        System.out.println(homeDelivery.totalPrice());
    }   }