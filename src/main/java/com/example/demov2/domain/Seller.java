package com.example.demov2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Seller {

    private String name = "Juan Pérez";
    private String store = "Tienda Central";

    @Autowired
    private Product product;

    public String showInfo() {
        String info = "seller: " + this.name + " store: " + this.store +
                " | product: " + product.getNombre() + " - price: " + product.getPrice();

        System.out.println(info); //
        return info;              //
    }
}
