package homework10.task3;

public class Product {
    private ProductType type;
    private double price;

    public Product(ProductType type, double price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

}
