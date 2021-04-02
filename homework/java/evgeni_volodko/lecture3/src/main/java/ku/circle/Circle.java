package ku.circle;

public class Circle {

    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double calculateArea(){
        return radius*radius*Math.PI;
    }

    public double getRadius(){
        return radius;
    }
}
