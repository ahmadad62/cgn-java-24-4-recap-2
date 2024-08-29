package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    // Constructor
    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    // Method to place a new order
    public void placeOrder(OrderRecord newOrder) {
       orderRepo.addOrder(newOrder);
    }

    // Method to get all orders
    public List<OrderRecord> getOrders() {
        return orderRepo.getAllOrders();
    }
}
