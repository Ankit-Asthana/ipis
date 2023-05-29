package org.example.repo;

import org.example.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreRepository extends CrudRepository<Product,Integer> {
}
