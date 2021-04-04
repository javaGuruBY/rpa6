package by.jrr.start;

public class DogDemo {

    public void voice(){
        System.out.println("Gav, gav");
    }
    public void eat(){
        System.out.println("Nomi-nomi");
    }
    public void sleep(){
        System.out.println("Zzzz");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(6);
        dog.setColor("White");
        dog.setName("Aydar");

        System.out.println("Age: " + dog.getAge());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Name: " + dog.getName());

        DogDemo dogDemo = new DogDemo();
        dogDemo.voice();
        dogDemo.eat();
        dogDemo.sleep();
    }
}
