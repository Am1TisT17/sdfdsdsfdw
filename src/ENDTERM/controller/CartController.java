package ENDTERM.controller;
import ENDTERM.model.Cart;
import ENDTERM.model.Product;
import ENDTERM.view.CartView;
public class CartController {
    private Cart cart;
    private CartView view;

    public CartController(Cart cart, CartView view) {
        this.cart = cart;
        this.view = view;
    }

    public void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    public void removeProductFromCart(Product product) {
        cart.removeProduct(product);
    }

    public void displayCart() {
        view.displayCart(cart);
    }
}
