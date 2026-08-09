abstract class Shape{
    abstract double getArea();
}

class Circle extends Shape{
    private double radius = 5.0;

    double getArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private double length = 4.0;
    private double width = 6.0;

    double getArea(){
        return length * width;
    }
}

public class Main{
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}