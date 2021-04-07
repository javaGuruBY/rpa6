package by.jrr.start;

public class DogDemo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.age = 1;
        dog1.color = "Black";
        dog1.name = "Dora";


        System.out.println("Dog name:" + dog1.name + " his " + dog1.age + ",she is " + dog1.color + " color. " );
        dog1.Voice();
        dog1.Sleep();
        dog1.Eat();
    }
}
