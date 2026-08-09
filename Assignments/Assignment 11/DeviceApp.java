interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light status: The light bulb is turned ON!");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan status: The ceiling fan is spinning ON!");
    }
}

public class DeviceApp {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switchable fan = new Fan();

        light.turnOn();
        fan.turnOn();
    }
}