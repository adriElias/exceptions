package org.exceptions;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice = 0;

    public double calculateTotal() {
        System.out.println(products.get(12));
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        totalPrice = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        return totalPrice;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
