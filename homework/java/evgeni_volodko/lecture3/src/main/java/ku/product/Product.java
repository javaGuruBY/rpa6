package ku.product;

public class Product {

    private final String name;
    private double regularPrice;
    private double discount;

    public Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double actualPrice(){
        return regularPrice - regularPrice * discount / 100.0;
    }

    public void printInformation(){
        System.out.printf("Product : name = \"%s\", regular price = %.2f BYN," +
                " discount = %.0f %%, actual price = %.2f BYN\n",
                name, regularPrice, discount, actualPrice());
    }

}
