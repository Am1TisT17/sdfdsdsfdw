package ENDTERM.model;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added to cart: " + product.getName());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Removed from cart: " + product.getName());
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
