package ku.stock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockTest {

    private Stock stock;

    @Test
    public void updatePrice() {
        stock.updatePrice(3.60);
        Assert.assertEquals(3.60, stock.getCurrentPrice(), 0.001);
        Assert.assertEquals(3.60, stock.getMaxPrice(), 0.001);
        Assert.assertEquals(3.50, stock.getMinPrice(), 0.001);

        stock.updatePrice(3.10);
        Assert.assertEquals(3.10, stock.getCurrentPrice(), 0.001);
        Assert.assertEquals(3.60, stock.getMaxPrice(), 0.001);
        Assert.assertEquals(3.10, stock.getMinPrice(), 0.001);

        stock.updatePrice(3.50);
        Assert.assertEquals(3.50, stock.getCurrentPrice(), 0.001);
        Assert.assertEquals(3.60, stock.getMaxPrice(), 0.001);
        Assert.assertEquals(3.10, stock.getMinPrice(), 0.001);
    }

    @Test
    public void setNameTest(){
        String changeName = "Change";
        stock.setName(changeName);
        Assert.assertEquals(changeName, stock.getName());
    }

    @Before
    public void setUp(){
        stock = new Stock("TEST", 3.50);
    }
}