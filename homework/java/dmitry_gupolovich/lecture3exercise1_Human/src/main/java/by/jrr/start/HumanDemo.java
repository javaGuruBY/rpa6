package by.jrr.start;

/**
 * Разработать класс - человек. И если его имя джон и ему 20, сделать форматированный вывод строки
 */
public class HumanDemo {
    public static void main(String[] args) {

        Human human = new Human();
        try {
            human.setAge(human.checkValidAge(0));
            human.setName("John");
            human.greet();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
