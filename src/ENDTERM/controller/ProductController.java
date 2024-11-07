package ENDTERM.controller;
import ENDTERM.model.Product;
import ENDTERM.view.ProductView;
public class ProductController {
    private Product model;
    private ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void displayProduct() {
        view.displayProduct(model);
    }
}
