package ENDTERM.facade;

import ENDTERM.model.Product;
import ENDTERM.model.Cart;
import ENDTERM.view.ProductView;
import ENDTERM.view.CartView;
import ENDTERM.controller.ProductController;
import ENDTERM.controller.CartController;
import ENDTERM.observer.CustomerNotification;
import ENDTERM.observer.Inventory;
import ENDTERM.model.UserFactory;
import ENDTERM.model.User;


public class ECommerceFacade {
    private ProductController productController;
    private CartController cartController;
    private Inventory inventory;
    private CustomerNotification notification;

    public ECommerceFacade() {
        inventory = new Inventory();
        notification = new CustomerNotification();

        // Добавляем наблюдателя для уведомлений
        inventory.addObserver(notification);

        // Инициализируем корзину и ее контроллер
        Cart cart = new Cart();
        CartView cartView = new CartView();
        cartController = new CartController(cart, cartView);
    }

    public void startShopping() {
        // Создаем пользователя и продукт
        Product product = new Product("Samsung S24", 670);
        ProductView productView = new ProductView();
        productController = new ProductController(product, productView);

        // Создаем пользователя с помощью фабрики
        User user = UserFactory.createUser("customer", "Ansar");
        System.out.println("User type: " + user.getUserType());

        // Демонстрируем функции
        productController.displayProduct();

        // Добавляем продукт в инвентарь и отправляем уведомление
        inventory.addProduct(product);

        // Добавляем продукт в корзину и выводим содержимое
        cartController.addProductToCart(product);
        cartController.displayCart();
    }
}
