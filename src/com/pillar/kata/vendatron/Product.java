package com.pillar.kata.vendatron;

import com.sun.istack.internal.NotNull;

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

        if (price < 0.0f)
            throw new IllegalArgumentException("Price cannot be less than $0");
        this.mPrice = price;
    }
}