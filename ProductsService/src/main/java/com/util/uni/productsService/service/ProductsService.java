package com.util.uni.productsService.service;

import java.util.List;
import java.util.ArrayList;

import com.util.uni.productsService.model.Products;
import com.util.uni.productsService.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
        List<Products> records = new ArrayList<>();
        productsRepository.findAll().forEach(records::add);
        return records;
    }

    public void addUser(Products userRecord) {
        productsRepository.save(userRecord);
    }
}   