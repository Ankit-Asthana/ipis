package org.example;


import org.example.model.Product;
import org.example.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myproducts")
public class ProductsController {
    @Autowired
    ProductsService productService;

    @PostMapping("/request")
    public String addProduct2 (@RequestBody Product newproduct) {
        return productService.addProduct(newproduct);
    }

    @GetMapping("/start")
    public String get(){
        return "Ok";
    }
}
