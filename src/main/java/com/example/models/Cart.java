package com.example.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;
    private Double total;
    private String description;
    private LocalDateTime createdIn;
    private LocalDateTime finalizedIn;

    public Cart(ArrayList<Product> products, Double total, String description, LocalDateTime createdIn, LocalDateTime finalizedIn) {
        this.products = products;
        this.total = total;
        this.description = description;
        this.createdIn = createdIn;
        this.finalizedIn = finalizedIn;
    }

    public Cart(LocalDateTime createdIn){
        this.products = new ArrayList<>();
        this.total = 0.0;
        this.description = "PENDING";
        this.createdIn = createdIn;
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }
}
