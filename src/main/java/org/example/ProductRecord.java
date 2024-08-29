package org.example;

public record ProductRecord(
        String id,
        String name,
        String brand,
        double price,
        int stockQuantity,
        String description,
        String category,
        String imageUrl
) {}

