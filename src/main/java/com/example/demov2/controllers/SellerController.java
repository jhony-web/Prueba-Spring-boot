package com.example.demov2.controllers;

import com.example.demov2.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class SellerController {

    @Autowired
    private Seller seller;

    @GetMapping("/say")
    public String getSeller() {

        return seller.showInfo();
    }
}