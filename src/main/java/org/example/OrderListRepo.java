package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo implements OrderRepo{
    private List<OrderRecord> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }


    public List<OrderRecord> getOrders() {
        return new ArrayList<>(orders);
    }

    public OrderRecord findById(String orderId) {
        for (OrderRecord order : orders) {
            if(order.orderId()==orderId){
                return order;
            }
        }
        return null;
    }

    public void addOrder(OrderRecord newOrder) {
        this.orders.add(newOrder);
    }

    @Override
    public void removeOrder(int orderId) {

    }

    @Override
    public OrderRecord getOrder(int orderId) {
        return null;
    }

    public void addOrders(List<OrderRecord> orders) {
        this.orders.addAll(orders);
    }

    public List<OrderRecord> removeOrder(OrderRecord order) {
        orders.remove(order);
        return orders;
    }

    public void setOrders(List<OrderRecord> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo orderListRepo = (OrderListRepo) o;
        return Objects.equals(orders, orderListRepo.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orders);
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }

    public List<OrderRecord> getAllOrders() {
        return orders;
    }

    @Override
    public void add(OrderRecord order) {
        orders.add(order);
    }

    @Override
    public void remove(OrderRecord order) {
        orders.remove(order);
    }

    @Override
    public OrderRecord getSingle(int id) {
        for(OrderRecord order : orders){
            if(order.orderId().equals(id)){
                return order;
            }
        }
        return null;
    }

    @Override
    public OrderListRepo getAll() {
        return null;
    }
}
