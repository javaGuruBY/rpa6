package by.jrr.start;

public class Dog {
    int age = 1;
    String color = "brown";
    String name = "dog";

    Dog(){
        voice();
    }
    Dog(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
        voice();
    }

    void voice(){
        System.out.println("Woof woof");
    }

    void eat(){
        System.out.println("Om-nom-nom");
    }

    void sleep(){
        System.out.println("Z-z-z-z-z");
    }

    void showDog(){
        System.out.println("This is " + name + "\nHe is " + age + " years old" + "\n He has " + color + " fur");
    }
}
