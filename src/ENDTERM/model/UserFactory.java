package ENDTERM.model;

public class UserFactory {
    public static User createUser(String userType, String name) {
        switch (userType.toLowerCase()) {
            case "customer":
                return new Customer(name);
            case "admin":
                return new Admin(name);
            default:
                throw new IllegalArgumentException("Unknown user type");
        }
    }
}

class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    @Override
    public String getUserType() {
        return "Customer";
    }
}

class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    @Override
    public String getUserType() {
        return "Admin";
    }
}