package org.example.repo;

import org.example.model.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductsRepository extends CrudRepository<Products,Integer> {
    List<Products> findByName(String name);
}
