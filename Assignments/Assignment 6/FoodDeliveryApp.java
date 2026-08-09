interface DeliveryStatus{
    void update();
}

public class FoodDeliveryApp{
    private String foodItem = "Pizza";

    // Inner Class
    class OrderDetails{
        void showOrder() {
            System.out.println("Order Item: " + foodItem);
        }
    }

    public static void main(String[] args){
        FoodDeliveryApp app = new FoodDeliveryApp();

        // Inner class usage
        FoodDeliveryApp.OrderDetails details = app.new OrderDetails();
        details.showOrder();

        // Anonymous class usage
        DeliveryStatus status = new DeliveryStatus(){
            public void update(){
                System.out.println("Status: Food is out for delivery!");
            }
        };
        status.update();
    }
}
