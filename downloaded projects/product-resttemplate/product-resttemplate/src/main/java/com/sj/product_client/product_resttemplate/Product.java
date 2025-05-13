package com.sj.product_client.product_resttemplate;



//product class

public class Product {

   
    private int id;
    private  String PName;
    private int price;

    public Product() {
    }

    public Product(int id, String PName, int price) {
        this.id = id;
        this.PName = PName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
