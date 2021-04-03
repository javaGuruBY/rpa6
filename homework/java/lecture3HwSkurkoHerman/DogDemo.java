package by.jrr.start;

public class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog duke = new Dog(2,"black","Duke");

        dog.showDog();
        dog.eat();

        duke.showDog();
        duke.sleep();
    }
}
