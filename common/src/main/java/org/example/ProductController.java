package org.example;


import org.example.service.ProductService;
import org.example.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 Represents a product controller.
 */
@RestController
@RequestMapping("/api")

public class ProductController {

    @Autowired
    ProductService productService;

//    @PostMapping("/add")
//    public Products addProduct (@RequestBody Products newproduct) {
//        return productService.addProduct(newproduct);
//    }

    @PostMapping("/add")
    public void addProducts (@RequestBody Products newproduct) {
        if(newproduct.getName()==null)
            throw new NullPointerException("Name cannot be have null values");
//            throw new NullPointerExceptionManager();
        if(newproduct.getName().length()<3)
            throw new IllegalArgumentException("Name Entered is smaller than 3 characters");
//            throw new IllegalArgumentExceptionMapper();
         productService.addProduct(newproduct);
    }

        @GetMapping("/products")
        public List<Products> getProductsByName(@RequestParam(name = "name") String name) {
            return productService.getProductsByName(name);
        }

}
