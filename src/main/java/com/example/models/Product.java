package com.example.models;

public class Product {
    private String name;
    private Double price;
    private Integer supply;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
        this.supply = 0;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.price;
    }

}
