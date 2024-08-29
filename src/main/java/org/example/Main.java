package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ProductRecap samsungA10= new ProductRecap("samsung-A10","Samsung A10","Samsung",225.5,10,"This is a mid quality smartphone.");

        // Creating instances of ProductRecap record
        ProductRecord samsungA10 = new ProductRecord(
                "SamsungA10",
                "Samsung A10",
                "Samsung",
                120.50,
                10,
                "This is mid-level smartphone!",
                "smartphone",
                "https://test.com"
        );

        ProductRecord samsungA20 = new ProductRecord(
                "SamsungA20",
                "Samsung A20",
                "Samsung",
                120.50,
                10,
                "This is mid-level smartphone!",
                "smartphone",
                "https://test.com"
        );

        ProductRecord iphon10 = new ProductRecord(
                "iphon10",
                "Iphon10",
                "Iphon",
                1200.50,
                5,
                "This is old smartphone!",
                "smartphone",
                "https://test.com"
        );

        ProductRecord iphon15 = new ProductRecord(
                "iphon15",
                "iphon15",
                "iphon15",
                1500.50,
                3,
                "This is high-level smartphone!",
                "smartphone",
                "https://test.com"
        );

        ProductRecord xiaomiNote = new ProductRecord(
                "xiaomiNote",
                "xiaomiNote",
                "xiaomi",
                250.50,
                100,
                "This is high-level smartphone!",
                "smartphone",
                "https://test.com"
        );

        ProductRecord nokia6600 = new ProductRecord(
                "nokia",
                "Nokia 6600",
                "Nokia",
                80.50,
                20,
                "This is conventional mobile!",
                "conventional",
                "https://test.com"
        );

        ProductRecord samsungK10 = new ProductRecord(
                "SamsungK10",
                "Samsung K10",
                "Samsung",
                120.50,
                10,
                "This is conventional mobile!",
                "conventional",
                "https://test.com"
        );

        //ProductRepo Test
        List<ProductRecord> products = Arrays.asList(samsungA10, samsungA20, iphon10, iphon15, nokia6600, xiaomiNote);

        ProductRepo productRepo = new ProductRepo();
        productRepo.addProducts(products);

        // Check the product repository
        System.out.println("Product Repo before update: " + productRepo.getSize());

        // Update the quantity of Samsung K10
        productRepo.addProduct(samsungK10);

        // Check the product repository after update
        System.out.println("Product Repo after update: " + productRepo.getSize());


        //Orders
        OrderRepo orderRepo = new OrderRepo();

        // Create some orders
        OrderRecord order1 = new OrderRecord(
                "1001",
                "C001",
                List.of("SamsungK10", "SamsungA10"),
                1599.98,
                "2024-08-29",
                "Pending"
        );
        OrderRecord order2 = new OrderRecord(
                "1002",
                "C002",
                List.of("nokia6600"),
                399.99,
                "2024-08-28",
                "Shipped"
        );
        //add order to the repo
        //orderRepo.addOrder(order1);
        //orderRepo.addOrder(order2);
        // Print all orders
        System.out.println("All Orders:");
        for (OrderRecord order : orderRepo.getOrders()) {
            System.out.println(order);
        }
        System.out.println("Order id 1002 =" + orderRepo.findById("1002"));

        orderRepo.addOrders(Arrays.asList(order1, order2));

        System.out.println("All Orders:");
        for (OrderRecord order : orderRepo.getOrders()) {
            System.out.println(order);
        }
    }
}