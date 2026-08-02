class RestaurantBilling {
    static int totalOrders = 0;

    // Dine-in: food cost + tax
    double calculateBill(double foodAmount, double taxPercentage) {
        totalOrders++;
        return foodAmount + (foodAmount * taxPercentage / 100);
    }

    // Takeaway: food cost + packaging charge
    double calculateBill(double foodAmount, double taxPercentage, double packagingCharge) {
        totalOrders++;
        return foodAmount + (foodAmount * taxPercentage / 100) + packagingCharge;
    }

    // Delivery: food cost + packaging charge + delivery fee
    double calculateBill(double foodAmount, double taxPercentage, double packagingCharge, double deliveryFee) {
        totalOrders++;
        return foodAmount + (foodAmount * taxPercentage / 100) + packagingCharge + deliveryFee;
    }

    public static void main(String[] args) {
        RestaurantBilling bill = new RestaurantBilling();

        System.out.println("Dine-in Bill: $" + bill.calculateBill(50.0, 10.0));
        System.out.println("Takeaway Bill: $" + bill.calculateBill(50.0, 10.0, 2.0));
        System.out.println("Delivery Bill: $" + bill.calculateBill(50.0, 10.0, 2.0, 5.0));
        System.out.println("Total Orders Placed: " + RestaurantBilling.totalOrders);
    }
}