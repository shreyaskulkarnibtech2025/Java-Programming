class Vehicle{
    String model = "Sedan";
    double baseValue = 2500000.0;

    void showVehicleInfo() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Base Value: Rs" + baseValue);
    }
}

class CarInsurance extends Vehicle{
    double insuranceRate = 0.05; // 5% premium

    void calculatePremium() {
        // Accessing parent method
        super.showVehicleInfo();

        // Accessing parent variable using super
        double premium = super.baseValue * insuranceRate;
        System.out.println("Annual Insurance Premium: Rs" + premium);
    }
}

public class InsuranceApp{
    public static void main(String[] args){
        CarInsurance policy = new CarInsurance();
        policy.calculatePremium();
    }
}
