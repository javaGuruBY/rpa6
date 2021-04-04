package by.jrr.start;

/**
 * Created by User on 04.04.2021.
 */
public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    /**
     * Расчет актуальной стоимости с учетом скидки
     */
    public double actualPrice() {
        return regularPrice * ((100 - discount) / 100);
    }

    /**
     * Вывод информации о продукте в консоль
     * Product : name = "Milk", regular price = 0.8 EUR, discount = 20%, actual price = 0.64 EUR
     */
    public void printInformation() {
        String printInformation = String.join(",", "name = ".concat(this.name)
                , " regular price = ".concat(String.valueOf(this.regularPrice)).concat(" EUR")
                , " discount = ".concat(String.format("%.0f",this.discount)).concat("%")
                , " actual price = ".concat(String.format("%.2f", actualPrice())).concat(" EUR")
        );
        System.out.println(printInformation);
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


}
