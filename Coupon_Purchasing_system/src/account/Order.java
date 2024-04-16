package account;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Order {
    private int orderId;
    private LocalDate orderDate;
    private List<Item> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.orderDate = LocalDate.now();
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getItemPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("- " + item.getItemName() + "\tRM" + item.getItemPrice());
        }
        System.out.println("Total Price: RM" + calculateTotalPrice());
    }
    
}