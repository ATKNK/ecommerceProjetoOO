package com.example.models;

import java.util.ArrayList;

public class Client extends User {

    ArrayList<Product> cart;

    public Client(String name, String email){
        super(name, email);
        this.cart = new ArrayList<>();
    }

    public Boolean addProductCart(Product p){

        if (p == null)
            return false;
        
        if (this.cart.contains(p))
            return false;
        
        this.cart.add(p);
        return true;
    }

    
}
