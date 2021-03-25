package by.jrr.start;

/**
 * Разработать класс - собака
 */
public class DogDemo {
    public static void main(String[] args) {

            Dog dog = new Dog();
            dog.setAge(dog.checkValidAge(40));

            dog.setColor("Yellow");
            dog.setName("Rubik");

            System.out.println(dog.toString());


    }
}
