package by.jrr.start.bean;

import java.util.Objects;

public class Triangle implements Figure {

    double heith;
    double ground;

    public Triangle() {
    }

    public Triangle(double heith, double ground) {
        this.heith = heith;
        this.ground = ground;
    }

    public double getHeith() {
        return heith;
    }

    public void setHeith(double heith) {
        this.heith = heith;
    }

    public double getGround() {
        return ground;
    }

    public void setGround(double ground) {
        this.ground = ground;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.heith, heith) == 0 &&
                Double.compare(triangle.ground, ground) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heith, ground);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "heith=" + heith +
                ", ground=" + ground +
                '}';
    }
}
