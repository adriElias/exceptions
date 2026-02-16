package org.exceptions;

public class App {
    public static void main(String[] args) {
        System.out.println("---- Sale of products ----");
        Product p1 = new Product("Bottle", 3);
        Product p2 = new Product("Biscuits", 2.3);
        Product p3 = new Product("Milk", 5.6);
        Product p4 = new Product("Bread", 2);

        Sale sale = new Sale();

        sale.addProduct(p1);
        sale.addProduct(p2);
        sale.addProduct(p3);
        sale.addProduct(p4);

        try {
            double totalSale = sale.calculateTotal();
            System.out.printf("Sale total: %.2f €%n", totalSale);
        } catch (EmptySaleException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Position out of range.");
        }

    }
}
