package com.faircode.checkdata;

public class Product {
    public Product (String name, double defaultPrice, double quantity) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IndexOutOfBoundsException("Quantity < 0");
        }
    }

    private double quantity;

    public double getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(double defaultPrice) {
        if (quantity > 0) {
            this.defaultPrice = defaultPrice;
        } else {
            throw new IndexOutOfBoundsException("defaultPrice < 0");
        }
    }

    private double defaultPrice;

    public double getFinalPrice() {
        return quantity * defaultPrice;
    }
}