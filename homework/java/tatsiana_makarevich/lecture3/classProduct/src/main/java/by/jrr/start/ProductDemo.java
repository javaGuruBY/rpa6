package by.jrr.start;

public class ProductDemo {

    public double actualPrice(double regularPrice, double discount){
        return regularPrice / 100 * (100 - discount);
    }

    void printInformation(Product product){
        String name = product.getName();
        double regularPrice = product.getRegularPrice();
        double discount = product.getDiscount();
        double actualPrice = actualPrice(regularPrice, discount);

        System.out.println("Product : name = " + name + ", regular price = " + regularPrice + " USD" +
                ", discount = " + discount + "%, actual price = " + actualPrice + " USD");
    }

    public static void main(String[] args) {
        Product product = new Product("Cake");
        product.setRegularPrice(5.6);
        product.setDiscount(10);

        ProductDemo productDemo = new ProductDemo();
        productDemo.printInformation(product);
    }
}
