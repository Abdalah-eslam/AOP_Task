package org.Task.Anotation.Service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
public class loggingAOP {
    public int heckStock(String sku) {
        return 100; // Example stock quantity
    }


    public void updateStock(String sku, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be non-negative");
        }
        System.out.println("Updating stock for SKU: " + sku + " with quantity: " + quantity);
        // Update stock logic here
    }

}
