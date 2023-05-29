package org.example.service;

import org.example.model.Product;
import org.example.repo.PreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    PreRepository productsRepository;

    public  String addProduct(Product newproduct) {
        System.out.println("Message recieved successfully"+ newproduct);
        productsRepository.save(newproduct);
        return "Success";
    }
}