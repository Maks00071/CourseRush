package Module2.Level2.Tasks.ProductAndMarket;

import java.util.List;

public class Market {
    private final String name;
    private List<Product> products;

    public Market(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
