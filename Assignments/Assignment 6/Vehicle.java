interface Action{
    void performAction();
}

public class Vehicle{
    private String name = "SUV";

    // Member Inner Class
    class Display {
        void show() {
            System.out.println("Vehicle Name: " + name);
        }
    }

    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Vehicle.Display display = v.new Display();
        display.show();

        Action drive = new Action(){
            public void performAction() {
                System.out.println("Vehicle is driving...");
            }
        };
        drive.performAction();
    }
}
