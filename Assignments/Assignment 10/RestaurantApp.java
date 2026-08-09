abstract class FoodOrder {
    double itemPrice;

    public FoodOrder(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    abstract double calculateBill();
}
class DineInOrder extends FoodOrder {
    private double serviceCharge = 5.0;

    public DineInOrder(double itemPrice) {
        super(itemPrice);
    }

    double calculateBill() {
        return itemPrice + serviceCharge;
    }
}
class TakeAwayOrder extends FoodOrder {
    private double packagingFee = 2.0;

    public TakeAwayOrder(double itemPrice) {
        super(itemPrice);
    }
    double calculateBill() {
        return itemPrice + packagingFee;
    }
}
public class RestaurantApp {
    public static void main(String[] args) {
        FoodOrder dineIn = new DineInOrder(25.00);
        FoodOrder takeAway = new TakeAwayOrder(25.00);

        System.out.println("Dine-In Total Bill : $" + dineIn.calculateBill());
        System.out.println("Take-Away Total Bill: $" + takeAway.calculateBill());
    }
}