package com.example.flowers;

import com.example.flowers.models.Product;

import java.util.List;

public class Helper {
    public static int sum(List<Product> cart) {
        return cart.stream().mapToInt(b -> b.getPrice()).sum();
    }
}
