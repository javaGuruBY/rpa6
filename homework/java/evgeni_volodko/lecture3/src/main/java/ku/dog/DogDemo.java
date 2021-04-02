package ku.dog;

public class DogDemo {

    public static void main(String[] args) {

        Dog dog1 = new Dog(1, "black", "Pit");
        Dog dog2 = new Dog(5, "yellow", "Tim");

        dog1.voice();
        dog2.voice();

        dog1.eat();
        dog2.eat();

        dog1.sleep();
        dog2.sleep();
    }
}
