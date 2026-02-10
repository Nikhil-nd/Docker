package com.nd.simplewebapp.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nd.simplewebapp.Entity.Products;

@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Products> getProducts(){
        return Arrays.asList(new Products(1,"HeadSet",5000),new Products(5,"Phone",7000));
    }
}
