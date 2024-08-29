package org.example;

public interface OrderListRepo {
    public void add(OrderRecord order);
    public void remove(OrderRecord order);
    public OrderRecord getSingle(int id);
    public OrderRepo getAll();
}
