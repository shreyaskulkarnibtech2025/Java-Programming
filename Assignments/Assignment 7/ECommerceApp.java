interface Taxable{
    double calculateTax();
}

abstract class Product{
    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}

class Electronic extends Product implements Taxable{
    public Electronic(String name, double price){
        super(name, price);
    }

    public double calculateTax(){
        return price * 0.18; // 18% tax
    }
}

class Clothing extends Product implements Taxable{
    public Clothing(String name, double price){
        super(name, price);
    }

    public double calculateTax(){
        return price * 0.05; // 5% tax
    }
}

// Grocery Class
class Grocery extends Product implements Taxable{
    public Grocery(String name, double price){
        super(name, price);
    }

    public double calculateTax(){
        return 0.0;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Product phone = new Electronic("Smartphone", 50000.0);
        Product shirt = new Clothing("T-Shirt", 3000.0);
        Product milk = new Grocery("Milk", 40.0);

        System.out.println(phone.name + " Tax: Rs" + ((Taxable) phone).calculateTax());
        System.out.println(shirt.name + " Tax: Rs" + ((Taxable) shirt).calculateTax());
        System.out.println(milk.name + " Tax: Rs" + ((Taxable) milk).calculateTax());
    }
}
