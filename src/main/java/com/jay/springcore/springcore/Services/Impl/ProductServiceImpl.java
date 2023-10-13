package com.jay.springcore.springcore.Services.Impl;

import com.jay.springcore.springcore.Entity.Product;
import com.jay.springcore.springcore.Repository.ProductRepo;
import com.jay.springcore.springcore.Services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    public final ProductRepo productRepo;

    @Autowired
    ProductServiceImpl(ProductRepo productRepo){
        this.productRepo = productRepo;
    }
    @Override
    public Product addProduct(Product product) throws Exception {
        try{
            return productRepo.save(product);
        }catch (Exception ex){
            log.error("Error Occurred : {} ", ex.getMessage());
            throw new Exception("Error Occurred");
        }
    }
}
