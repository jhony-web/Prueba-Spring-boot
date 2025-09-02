package com.example.demov2.controllers;

import com.example.demov2.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private Seller seller;

    @GetMapping("/info")
    public String getInfo() {
        seller.showInfo();
        return "Información mostrada en consola";
    }
}