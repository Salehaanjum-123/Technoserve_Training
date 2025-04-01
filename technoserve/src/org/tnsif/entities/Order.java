package org.tnsif.entities;

import java.util.HashMap;
import java.util.Map;

public class Order {
	private static int orderCounter = 0;
    private int orderId;
    private Customer customer;
    private Map<Product, Integer> products;
    private String status;

    public Order(Customer customer, Map<Product, Integer> products) {
        this.orderId = ++orderCounter;
        this.customer = customer;
        this.products = new HashMap<>(products);
        this.status = "Pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderID: ").append(orderId).append(", Customer: ").append(customer.getUsername()).append(", Status: ").append(status).append("\n");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            sb.append("Product: ").append(entry.getKey().getName()).append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}


}
