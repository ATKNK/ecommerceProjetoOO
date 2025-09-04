package com.example.models;

public class Client extends User {

    private Cart cart;

    public Client(String name, String email) {
        super(name, email);
        this.cart = new Cart(null);
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Boolean addProductCart(Product p) {
        if (p == null)
            return false;
        return this.cart.getProducts().add(p);
    }

}
