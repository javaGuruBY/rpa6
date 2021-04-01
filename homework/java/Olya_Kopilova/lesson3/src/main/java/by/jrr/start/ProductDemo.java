package by.jrr.start;

public class ProductDemo {
    public static void main(String[] args){
        Product product1 = new Product("Milk", 0.8, 20.0);
        product1.printInformation();
    }
}

class Product {
    String name;
    double regularPrice;
    double discount;
    double actualPrice;

    public Product(String productName, double regPrice, double discountProduct){
        name = productName;
        regularPrice = regPrice;
        discount = discountProduct;
}

    double actualPrice() {
        return regularPrice - (regularPrice * discount / 100.0);
}

    void printInformation() {
        System.out.println("Product : name = " + name + ", regular price = " + regularPrice + " EUR, " +
        "discount =" + discount + "%, actual price = " + actualPrice() + " EUR");
    }
}

