package com.karthik.learn.rest.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        System.out.println("products getting");

        return "pen";
    }


}
