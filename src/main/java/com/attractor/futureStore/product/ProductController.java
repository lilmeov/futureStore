package com.attractor.futureStore.product;

import com.attractor.futureStore.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Validated
public class ProductController {
    private final ProductService productService;

    @GetMapping("/ByBetweenPrices/{minPrice}")
    public List<Product> getByBetweenPrices(@PathVariable float minPrice, @RequestParam float maxPrice){
        return productService.getByBetweenPrice(minPrice, maxPrice);
    }

    @GetMapping("/getBySeveralCriteria/{type}")
    public List<Product> getBySeveralCriteria(@PathVariable String type, @RequestParam String name, float min, float max){
        return productService.getBySeveralCriteria(type, name, min, max);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/getByType/{type}")
    public List<Product> getByType(@PathVariable String type){
        return productService.getByType(type);
    }


    @GetMapping("/getById/{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @GetMapping("/getByProductName/{name}")
    public List<Product> getByName (@PathVariable String name){
        return productService.getByName(name);
    }

    @GetMapping("/getByProductPrice/{price}")
    public List<Product> getByPrice (@PathVariable float price){
        return productService.getByPrice(price);
    }

    @PostMapping("/saveProduct")
    public Product saveNewProduct(@RequestBody @Valid Product product){
        return productService.saveNewProd(product);
    }
}
