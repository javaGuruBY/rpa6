package by.jrr.start;

public class ProductDemo {

    public static void main(String[] args) {
        Product apple = new Product("Apple");
        apple.regularPrice = 1;
        apple.discount = 10;
        apple.printInformation();

        Product chocolate = new Product("Chocolate");
        chocolate.regularPrice = 6;
        chocolate.discount = 2;
        chocolate.printInformation();
    }
}
