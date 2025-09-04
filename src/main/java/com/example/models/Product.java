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

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public Integer getSupply(){
        return supply;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setSupply(Integer supply){
        this.supply = supply;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.price;
    }

}
