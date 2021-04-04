package by.jrr.start;

public class CircleDemo {

    public double calculateArea(Circle circle){
        return 2 * Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public static void main(String[] args) {
        CircleDemo circleDemo = new CircleDemo();

        Circle circle = new Circle(2.0);
        double area = circleDemo.calculateArea(circle);
        System.out.println(area);
    }
}
