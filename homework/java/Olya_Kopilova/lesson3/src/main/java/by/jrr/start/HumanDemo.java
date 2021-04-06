package by.jrr.start;

public class HumanDemo {
    public static void main (String[] args) {
        Human human1 = new Human("John", 20);
        human1.greet();

        Human human2 = new Human();
        human2.name = "Willy";
        human2.age = 16;
        human2.greet();
    }
}

class Human {

    String name;
    int age;

    public Human(String humanName, int humanAge){
        name = humanName;
        age = humanAge;
    }

    public Human(){}

    void greet () {System.out.println("Hi! My name is " + name +", I'm " + age + " years old");}

}

