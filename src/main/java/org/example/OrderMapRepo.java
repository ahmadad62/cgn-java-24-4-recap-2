package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMapRepo implements OrderRepo{
    private Map<Integer, OrderRecord> orderMap = new HashMap<>();

    @Override
    public void addOrder(OrderRecord order) {
        orderMap.put(Integer.valueOf(order.orderId()),order);
    }

    @Override
    public void removeOrder(int orderId) {
            orderMap.remove(orderId);
    }

    @Override
    public OrderRecord getOrder(int orderId) {
        return orderMap.get(orderId);
    }

    @Override
    public List<OrderRecord> getAllOrders() {
        return orderMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public void add(OrderRecord order) {

    }

    @Override
    public void remove(OrderRecord order) {

    }

    @Override
    public OrderRecord getSingle(int id) {
        return null;
    }

    @Override
    public OrderListRepo getAll() {
        return null;
    }
}
