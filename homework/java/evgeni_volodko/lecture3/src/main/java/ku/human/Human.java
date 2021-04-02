package ku.human;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.printf("Hi! My name is %s, I'm %d years old. Glad to see you.\n", name, age);
    }
}
