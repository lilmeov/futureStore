package com.attractor.futureStore.product;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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
