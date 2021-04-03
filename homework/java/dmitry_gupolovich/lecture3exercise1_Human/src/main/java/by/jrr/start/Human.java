package by.jrr.start;

public class Human {
    private int age;
    private String name;

    Human() {
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void greet() {

        if (name.equals("John") & age == 20) {
            System.out.printf("Hi! My name is %s, I'm %d years old. Glad to see you.\n", name, age);
        } else {
            System.out.println("Name is " + name + " age " + age);
        }
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int checkValidAge(int age) throws Exception {

        if (age <= 0) {
            throw new Exception("The age must be more than 0");
        }
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
