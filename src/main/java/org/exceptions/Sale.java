package org.exceptions;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice = 0;

    public double calculateTotal() {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        for (Product product : products) {
            totalPrice *= product.getPrice();
        }

        return totalPrice;
    }
}
