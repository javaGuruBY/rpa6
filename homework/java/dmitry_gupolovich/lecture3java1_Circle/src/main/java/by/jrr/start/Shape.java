package by.jrr.start;

/**
 * Created by User on 27.03.2021.
 */
public abstract class Shape {

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "square=" + calculateArea();
    }
}
