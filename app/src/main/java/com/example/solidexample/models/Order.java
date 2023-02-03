package com.example.solidexample.models;

public class Order {
    String customerName = "Alina";
    String customerEmail = "aap_1994@mail.ru";
    private String id;

    public boolean isValid() {return false;}
    public String getCustomerName() {return customerName;}

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public Item[] getItems(){ return new Item[0];}
    public String getId(){ return id;}
    public void setId(String id){this.id = id;}
}
