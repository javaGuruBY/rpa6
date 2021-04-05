package by.jrr.start;

/**
 * Created by User on 27.03.2021.
 */
public class CircleDemo {
    public static void main(String[] args) {
        /**
         * Shape - это обобщение. Мало ли нам понадобится еще посчитать площадь у квадрата,
         * треугольника, и другой фигуры. Название метода calculateArea будет для всех
         * фигур одинаковым, но сама формула будет разная. Т.к. классы у нас будут разные,
         * но с помощью наследования, ключевого слова extends будут иметь одного общего предка Shape
         */
        Shape shape = new Circle(90);
        System.out.println(shape.calculateArea());
    }
}
