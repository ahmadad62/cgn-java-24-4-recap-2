package org.example;

import java.util.List;

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderListRepo orderListRepo;

    // Constructor
    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    // Method to place a new order
    public void placeOrder(OrderRecord newOrder) {
       orderListRepo.addOrder(newOrder);
    }

    // Method to get all orders
    public List<OrderRecord> getOrders() {
        return orderListRepo.getAllOrders();
    }
}
