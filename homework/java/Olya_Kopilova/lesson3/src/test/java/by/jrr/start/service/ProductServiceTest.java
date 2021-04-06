package by.jrr.start.service;

import by.jrr.start.ProductService;
import by.jrr.start.bean.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void printInformation() {

        Product product = new Product("Milk", 0.8, 20.0);
        ProductService productService = new ProductService(product);

        assertEquals("Product : name = Milk, regular price = 0.8 EUR, discount = 20.0%, actual price = 0.64 EUR",
                productService.printInformation());

    }

    @Test
    public void actualPrice() {
        Product product = new Product("Milk", 0.8, 20.0);
        ProductService productService = new ProductService(product);

        assertEquals(0.64, productService.actualPrice(), 0.001);
    }
}
