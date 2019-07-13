package com.example.v_power;

import java.util.Date;

public class Product {
    private String company;
    private String price;
    private String name;


    private String OEM;
    private String categoryName;

    private Date created;
    private Date updated;
    private String objectId;

    private String ItemCode;
    private String stdpkg;
    private  String MOQ;

    //All constructors


    public Product() {
    }


    // getters and setters


    public String getMOQ() {
        return MOQ;
    }

    public void setMOQ(String MOQ) {
        this.MOQ = MOQ;
    }

    public String getStdpkg() {
        return stdpkg;
    }

    public void setStdpkg(String stdpkg) {
        this.stdpkg = stdpkg;
    }



    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getOEM() {
        return OEM;
    }

    public void setOEM(String OEM) {
        this.OEM = OEM;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String category) {
        this.categoryName = category;
    }
}


