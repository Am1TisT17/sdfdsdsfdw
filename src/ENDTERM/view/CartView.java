package ENDTERM.view;

import ENDTERM.model.Cart;
import ENDTERM.model.Product;
public class CartView {
    public void displayCart(Cart cart) {
        System.out.println("Cart contents:");
        for (Product product : cart.getProducts()) {
            System.out.println("Product: " + product.getName() + " | Price: $" + product.getPrice());
        }
        System.out.println("Total: $" + cart.calculateTotal());
    }
}
