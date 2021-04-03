package by.jrr.start;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog() {
    }

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        System.out.println("Собака лает");
    }

    public void eat() {
        System.out.println("Собака есть");
    }

    public void sleep() {
        System.out.println("Собака спит");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int checkValidAge(int age) {
        try {
            if ((age < 0) || (age > 35)) {
                throw new Exception("The age must be more than 0 and less 35");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (color != null ? !color.equals(dog.color) : dog.color != null) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
