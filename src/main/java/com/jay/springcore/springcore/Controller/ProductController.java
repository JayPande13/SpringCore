package com.jay.springcore.springcore.Controller;

import com.jay.springcore.springcore.Entity.Product;
import com.jay.springcore.springcore.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping()
    public Product addProduct(@RequestBody Product product) throws Exception {
        return productService.addProduct(product);
    }
}
