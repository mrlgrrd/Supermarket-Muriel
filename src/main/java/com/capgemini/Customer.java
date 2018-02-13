package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {
    /**
     * declare the Customer's first name
     */
    private String firstName;

    /**
     * Declare the Customer's last name
     */
    private String lastName;

    /**
     * define the arreyList of products
     */
    private ArrayList<Product> basket = new ArrayList<Product>();

    /**
     * appoint the first and last name to the Customer in this constructor
     *
     * @param firstName first name string
     * @param lastName  last name string
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * this method specifies what products are bought
     *
     * @param product specify the amount bought of a product
     */
    public abstract void addToBasket(Product product);

    /**
     * this method greets the customer
     *
     * @return greeting for the customer
     */
    public abstract String greeting();

    /**
     * getter
     * @return method
     */
    public ArrayList<Product> getBasket() {
        return basket;
    }
}
