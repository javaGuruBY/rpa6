package by.jrr.start;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
        greet();
    }

    void greet(){
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}
