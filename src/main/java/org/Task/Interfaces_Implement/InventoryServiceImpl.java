package org.Task.Interfaces_Implement;

public class InventoryServiceImpl implements InventoryService {

    @Override
    public int heckStock(String sku) {
        return 100; // Example stock quantity
    }

    @Override
    public void updateStock(String sku, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be non-negative");
        }
        System.out.println("Updating stock for SKU: " + sku + " with quantity: " + quantity);
        // Update stock logic here
    }
}
