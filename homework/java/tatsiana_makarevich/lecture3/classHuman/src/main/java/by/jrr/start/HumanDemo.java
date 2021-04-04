package by.jrr.start;

public class HumanDemo {

    public void greet(Human human) {
        String name = human.getName();
        int age = human.getAge();
        System.out.println("Hello, my name is " + name + ". I'm " + age);
    }

    public static void main(String[] args) {
        Human human = new Human("Kura", 23);

        HumanDemo humanDemo = new HumanDemo();
        humanDemo.greet(human);
    }
}
