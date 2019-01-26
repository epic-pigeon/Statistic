package com.faircode.checkdata;

import java.util.ArrayList;

public class Check {
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Check() {
        this.products = new ArrayList<>();
    }

    public Check(ArrayList<Product> products) {
        this.products = products;
    }

    public double calculateTotalSum() {
        double totalSum = 0;
        for (Product product: products) {
            totalSum += product.getFinalPrice();
        }
        return totalSum;
    }
}