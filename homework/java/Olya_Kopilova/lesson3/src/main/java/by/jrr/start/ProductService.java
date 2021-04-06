package by.jrr.start;

import by.jrr.start.bean.Product;

public class ProductService {

    Product product;

    public ProductService(Product product) {
        this.product = product;
    }

    double actualPrice() {
        return product.getRegularPrice()
                - (product.getRegularPrice() * product.getDiscount() / 100.0);
    }

    public String printInformation() {
        return String.format("Product : name = %s, regular price = %s EUR, discount = %s%%, actual price = %s EUR",
                product.getName(),
                product.getRegularPrice(),
                product.getDiscount(),
                this.actualPrice());
    }
}
