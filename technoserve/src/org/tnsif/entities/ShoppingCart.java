package org.tnsif.entities;

import java.util.HashMap;
import java.util.Map;

class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeItem(Product product) {
        if (items.containsKey(product)) {
            items.remove(product);
        }
    }

    public void updateQuantity(Product product, int quantity) {
        if (items.containsKey(product)) {
            items.put(product, quantity);
        }
    }

    public void clearCart() {
        items.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            sb.append(entry.getKey().getName()).append(", Quantity: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
