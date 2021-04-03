package by.jrr.start;

public class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice - this.regularPrice / 100 * this.discount;
    }

    void printInformation() {
        System.out.println("Product : " + name + "" +
                "\nregular price = " + regularPrice + "EUR" +
                "\ndiscount = " + discount + "%" +
                "\nactual price = " + this.actualPrice() + "EUR\n");
    }
}
