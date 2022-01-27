package com.attractor.futureStore.product;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

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

}
