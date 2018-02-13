package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    /**
     * Register calculates the total amount the customer needs to pay, and gives an overview of the purchased products
     */

    /**
     * calculate the sum of all the products the customer has bought
     */
    void checkout(Customer customer);

    /**
     * calculate the discount per product type for the customer
     */
    void calculateDiscount(Customer customer);

    /**
     * this method provides a list of all the products that the customer bought
     * @param customer specify which customer
     * @return a receipt with the bought products
     */
    void printReceipt(Customer customer);

    /**
     * initialize the Register with all the available products
     * 
     */
    void initialize(ArrayList<Product> products);


}