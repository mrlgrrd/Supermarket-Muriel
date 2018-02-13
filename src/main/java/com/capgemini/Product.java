package com.capgemini;

import java.util.ArrayList;

public class Product {
    /**
     * POJO (plain old java object)
     */
    private String name;

    private double price;

    /**
     * getters and setters
     *
     * @return methods
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
