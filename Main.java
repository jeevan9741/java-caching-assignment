import java.util.*;

// Order Class
class Order {
    int orderId;
    String productName;

    public Order(int orderId, String productName) {
        this.orderId = orderId;
        this.productName = productName;
    }
}

// User Class
class User {
    int id;
    String name;
    List<Order> orders;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}

// UserService Class
class UserService {

    private Map<Integer, User> cache = new HashMap<>();

    public User getUser(int id) {

        if (cache.containsKey(id)) {
            System.out.println("Fetching from Cache");
            return cache.get(id);
        }

        System.out.println("Fetching from Database");

        // Simulated Database Data
        User user = new User(id, "Yash");

        user.addOrder(new Order(1, "Mobile"));
        user.addOrder(new Order(2, "Laptop"));

        cache.put(id, user);

        return user;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        UserService service = new UserService();

        // First Call
        User u1 = service.getUser(1);
        display(u1);

        // Second Call
        User u2 = service.getUser(1);
        display(u2);
    }

    public static void display(User user) {
        System.out.println("User: " + user.name);
        System.out.print("Orders: ");

        for (Order o : user.orders) {
            System.out.print(o.productName + ", ");
        }

        System.out.println("\n");
    }
}