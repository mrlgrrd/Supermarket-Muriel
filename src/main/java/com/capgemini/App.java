package com.capgemini;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /**
         * create a new Customer named customer, appoint his first and last name
         */
        Customer customer = new Customer("Jan", "Janssen") {
            @Override
            public void addToBasket(Product product) {

            }

            @Override
            public String greeting() {
                return null;
            }
        };

    }

}

