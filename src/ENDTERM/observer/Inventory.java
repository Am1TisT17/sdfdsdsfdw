package ENDTERM.observer;

import ENDTERM.model.Product;

public class Inventory extends Observable{
    public void addProduct(Product product) {
        System.out.println("Product added to inventory: " + product.getName());
        notifyObservers("New product available: " + product.getName());
    }
}
