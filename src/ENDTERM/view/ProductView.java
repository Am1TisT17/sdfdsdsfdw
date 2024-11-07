package ENDTERM.view;
import ENDTERM.model.Product;
public class ProductView {
    public void displayProduct(Product product) {
        System.out.println("Product: " + product.getName() + " | Price: $" + product.getPrice());
    }
}
