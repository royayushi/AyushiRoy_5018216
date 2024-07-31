package Inventory_P1;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Adding a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Updating a product
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Deleting a product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Displaying all products
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding products
        manager.addProduct(new Product("101", "Apple", 50, 0.50));
        manager.addProduct(new Product("102", "Banana", 30, 0.20));

        // Displaying products
        manager.displayProducts();

        // Updating product
        manager.updateProduct(new Product("101", "Apple", 60, 0.55));

        // Displaying products
        manager.displayProducts();

        // Deleting product
        manager.deleteProduct("102");

        // Displaying products
        manager.displayProducts();
    }
}
