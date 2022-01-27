package com.attractor.futureStore.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> getProductsByProductTypeType (String type);
    Product getProductById (Integer id);
    List<Product> getProductsByPrice (float price);
    List<Product> getProductsByName (String name);
}
