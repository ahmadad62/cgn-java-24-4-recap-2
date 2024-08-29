package org.example;

import java.util.List;

public interface OrderRepo {
    void addOrder(OrderRecord order);
    void removeOrder(int orderId);
    OrderRecord getOrder(int orderId);
    List<OrderRecord> getAllOrders();

    void add(OrderRecord order);

    void remove(OrderRecord order);

    OrderRecord getSingle(int id);

    OrderListRepo getAll();
}
