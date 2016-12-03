package com.pillar.kata.vendatron;

/**
 * This class represents a product inside a vending machine.
 * A product contains a name and a price.
 */
public class Product {
    private String mName;
    private float mPrice;

    public Product(String name, float price) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null");
        this.mName = name;

        this.mPrice = price;
    }
}