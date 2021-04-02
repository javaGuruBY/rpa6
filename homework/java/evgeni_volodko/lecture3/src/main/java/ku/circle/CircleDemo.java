package ku.circle;

public class CircleDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle(20.0);
        Circle c2 = new Circle(3.1);

        double area1 = c1.calculateArea();
        double area2 = c2.calculateArea();

        System.out.printf("Circle 1 has radius = %.2f, area = %.2f\n", c1.getRadius(), area1);
        System.out.printf("Circle 2 has radius = %.2f, area = %.2f\n", c2.getRadius(), area2);
    }
}
