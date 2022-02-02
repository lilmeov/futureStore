package com.attractor.futureStore.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getBySeveralCriteria(String type, String name, float min, float max){
        return productRepository.getProductsByProductTypeTypeAndNameAndPriceBetween(type, name, min, max);
    }

    public List<Product> getByBetweenPrice(float minPrice, float maxPrice){
        return productRepository.getProductsByPriceBetween(minPrice, maxPrice);
    }

    public List<Product> getAll(){
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getByType(String type){
        return productRepository.getProductsByProductTypeType(type);
    }//

    public Product getById(Integer id){
        return productRepository.getProductById(id);
    }

    public List<Product> getByPrice(float price){
        return productRepository.getProductsByPrice(price);
    }

    public List<Product> getByName(String prodName){
        return productRepository.getProductsByName(prodName);
    }

    public Product saveNewProd(Product product){
        return productRepository.save(product);
    }
}
