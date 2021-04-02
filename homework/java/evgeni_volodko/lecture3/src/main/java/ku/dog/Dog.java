package ku.dog;

public class Dog {

    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name){
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice(){
        System.out.println("The dog barked");
    }

    public void eat(){
        System.out.println("The dog started to eat");
    }

    public void sleep(){
        System.out.println("Now the dog is sleeping");
    }
}
