package com.example.v_power;

import java.util.ArrayList;

public class Order {
    public class OrderItems{
        public Product product;
        public int Quantity;

    }
    public ArrayList<OrderItems> AllItemsOrdered = new ArrayList<OrderItems>();
    public Customer customerDetails;

    public String orderStatus="Not Delivered";

    public Order() {

    }
}
