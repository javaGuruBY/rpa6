package by.jrr.start;

/**
 * Разработать программу, которая позволяет создавать продукт с произвольным именем,
 * стоимостью, а также расчетом стоимости с учетом скидки.
 */
public class ProductDemo {

    public static void main(String[] args) {
        Product milk = new Product("Milk");
        milk.setRegularPrice(0.8);
        milk.setDiscount(20);
        milk.printInformation();
    }
}
