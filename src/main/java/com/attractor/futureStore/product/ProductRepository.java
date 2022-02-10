package com.attractor.futureStore.product;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> getProductsByProductTypeType (String type);
    Product getProductById (Integer id);
    List<Product> getProductsByPrice (float price);
    List<Product> getProductsByName (String name);

    List<Product> getProductsByPriceBetween(float minPrice, float maxPrice);

    List<Product> getProductsByProductTypeTypeAndNameAndPriceBetween(String type, String name, float min, float max);
    Page<Product> findAll(Pageable pageable);

    @Query(value = "select  products from products, users, product_user where products.id = product_user.product_id and users.id = product_user.user_id",
            nativeQuery = true)
    List<Product> findAllUsersInCommonTable();
}
