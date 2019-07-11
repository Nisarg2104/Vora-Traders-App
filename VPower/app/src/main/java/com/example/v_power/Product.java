package com.example.v_power;

public class Product {
    private String company;
    private double price;
    private String name;
    public int quantity;
    private String description;
    private String OEM;
    private String category;
    public String imageLocation;


    //All constructors


    public Product() {
    }

    public Product(String company, double price, String name, int quantity, String description, String OEM, String category, String imageLocation) {
        this.company = company;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.OEM = OEM;
        this.category = category;
        this.imageLocation = imageLocation;
    }


    public Product(String company, double price, String name, int quantity) {
        this.company = company;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public Product(String company, double price, String name) {
        this.company = company;
        this.price = price;
        this.name = name;
    }

    // getters and setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOEM() {
        return OEM;
    }

    public void setOEM(String OEM) {
        this.OEM = OEM;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
