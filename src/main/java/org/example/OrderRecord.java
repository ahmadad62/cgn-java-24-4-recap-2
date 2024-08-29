package org.example;

import java.util.List;

public record OrderRecord(
        String orderId,
        String customerId,
        List<String > productIds,
        double totalAmount,
        String orderDate,
        String status  // Status of the order (e.g., "Pending", "Shipped", "Delivered")
) {
}
