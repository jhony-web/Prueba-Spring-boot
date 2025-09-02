package com.example.demov2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Seller {

    private String name = "Juan Pérez";
    private String store = "Tienda Central";

    @Autowired
    private Product product;

    public void showInfo() {
        System.out.println("seller: " + this.name + " store " + this.store);
        System.out.println("name product: " + product.getNombre() + " - price: " + product.getPrice());
    }
}
