package ku.human;

public class HumanDemo {

    public static void main(String[] args) {

        Human alex = new Human("Alex", 28);
        Human john = new Human("John", 34);

        alex.greet();
        john.greet();
    }
}
