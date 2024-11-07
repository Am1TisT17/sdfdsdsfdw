package ENDTERM.observer;

public class CustomerNotification implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Notification for customer: " + message);
    }
}
