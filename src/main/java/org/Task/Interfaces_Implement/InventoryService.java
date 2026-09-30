package org.Task.Interfaces_Implement;

public interface InventoryService {

    public int heckStock(String sku);
    public void updateStock(String sku, int quantity);

}
