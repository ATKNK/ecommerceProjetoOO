package com.example.models;

public class Admin extends User {
    
    public Admin(String name, String email){
        super(name, email);
    }

    public Boolean addProduct(Product p){
        if(p == null)
        return false;

        //Cart.products.add(p);
        return true;
    }
}
