class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone() {
        this.brand = "Generic";
        this.model = "Basic";
        this.price = 0.0;
    }

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor to create duplicate records
    MobilePhone(MobilePhone phone) {
        this.brand = phone.brand;
        this.model = phone.model;
        this.price = phone.price;
    }

    void display() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Price: $" + price);
    }

    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone("Apple", "iPhone 15", 799.99);
        MobilePhone p2 = new MobilePhone(p1); // Duplicate object record

        p1.display();
        p2.display();
    }
}