package ku.stock;

public class Stock {

    private String name;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, double price){
        this.name = name;
        this.currentPrice = price;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public void updatePrice(double price){
        currentPrice = price;
        if (currentPrice > maxPrice) maxPrice = currentPrice;
        if (currentPrice < minPrice) minPrice = currentPrice;
    }

    public void printInformation(){
        System.out.printf("Company = '%s', Current price = %.2f, Min price = %.2f, Max price = %.2f\n",
                name, currentPrice, minPrice, maxPrice);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getMinPrice(){
        return minPrice;
    }

    public double getMaxPrice(){
        return maxPrice;
    }


    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", 10);
        stock.printInformation();
        stock.updatePrice(15);
        stock.printInformation();
        stock.updatePrice(2);
        stock.printInformation();
        stock.updatePrice(10);
        stock.printInformation();
    }
}
