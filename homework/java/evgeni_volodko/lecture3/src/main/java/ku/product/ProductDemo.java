package ku.product;

public class ProductDemo {

    public static void main(String[] args) {

        Product p1 = new Product("Eggs", 10.3, 20);
        Product p2 = new Product("Orange", 4.7, 11);

        p1.printInformation();
        p2.printInformation();
    }
}
