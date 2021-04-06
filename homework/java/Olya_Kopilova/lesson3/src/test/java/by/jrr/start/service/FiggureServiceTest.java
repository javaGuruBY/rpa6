package by.jrr.start.service;

import by.jrr.start.bean.Circle;
import by.jrr.start.bean.Rectangle;
import by.jrr.start.bean.Triangle;
import by.jrr.start.processor.FiggureService;
import org.junit.Test;

import static org.junit.Assert.*;

public class FiggureServiceTest {

    @Test
    public void calculateCircleSquare() throws Exception {
        double radius = 3;
        Circle circle = new Circle(radius);
        String result = FiggureService.calculateSquare(circle);
        assertEquals("S = 28.27", result);
    }

    @Test
    public void calculateRectangleSquare() throws Exception {
        Rectangle rectangle = new Rectangle(3, 5);
        String result = FiggureService.calculateSquare(rectangle);
        assertEquals("S = 15.00", result);
    }

    @Test
    public void calculateTriangleSquare() throws Exception {
        Triangle triangle = new Triangle(3, 5);
        String result = FiggureService.calculateSquare(triangle);
        assertEquals("S = 7.50", result);
    }
}
