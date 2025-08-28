package com.example.models;

import com.example.Main;

public class Admin extends User {
    
    public Admin(String name, String email){
        super(name, email);
    }

    public Boolean addProduct(Product p){
        if(p == null)
        return false;

        Main.dbProducts.add(p);
        return true;
    }
}
