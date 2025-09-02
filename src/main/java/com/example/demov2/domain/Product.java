package com.example.demov2.domain;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private String nombre;
    private Double price;

    public Product() {} //

    public Product(String nombre, Double price) {
        this.nombre = nombre;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}