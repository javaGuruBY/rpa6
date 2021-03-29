package by.jrr.start;

public class DogDemo {
    public static void main (String[] args) {
        Dog dog1 = new Dog();
        dog1.age = 5;
        dog1.color = "black";
        dog1.name = "Tuzik";
        dog1.voice();

        Dog dog2 = new Dog();
        dog2.age = 7;
        dog2.color = "white";
        dog2.name = "Bobik";
        dog2.eat();
        dog2.sleep();
    }
}

class Dog{
    int age;
    String color;
    String name;

    void voice(){
        System.out.println(name +"hau-hau-hau");
    }

    void eat(){
        System.out.println(name +" om nom nom");
    }
    void sleep(){
        System.out.println(name +" hrrrr.... hrrrrr....");
    }
}