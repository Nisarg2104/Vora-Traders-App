package com.example.v_power;

import java.util.ArrayList;

public class Order {
    public ArrayList<Product> AllItemsOrdered = new ArrayList<Product>();
    public Customer customerDetails;
    private long orderNumber=0;
    public String orderStatus="Not Delivered";

    public Order() {
        orderNumber++;
    }
}
