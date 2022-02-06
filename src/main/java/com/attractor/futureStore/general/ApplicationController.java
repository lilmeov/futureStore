package com.attractor.futureStore.general;

import com.attractor.futureStore.product.Product;
import com.attractor.futureStore.product.ProductRepository;
import com.attractor.futureStore.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class ApplicationController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    @GetMapping("/hello")
    public String getParam(@RequestParam(value = "prod_name") String prodName,
                           @RequestParam(name = "prod_name_button") String prodButton, Model model){
        model.addAttribute("name", prodName);
        List<Product> products = productService.getByName(prodName);
        model.addAttribute("products", products);
        model.addAttribute("button", prodButton);
        return "page";
    }

    @GetMapping("/type")
    public String getTypeParam(@RequestParam(value = "prod_type") String prodType,
                               @RequestParam(name = "prod_type_button") String prodButton, Model model){
        model.addAttribute("name", prodType);
        model.addAttribute("button", prodButton);
        List<Product> products = productService.getByType(prodType);
        model.addAttribute("prodTypes", products);
        return "page";
    }


    @GetMapping("/")
    public String getIndex(){
        return "indexx";
    }

    @GetMapping("/register")
    public String getRegistrationPage(){
        return "register";
    }

    @GetMapping("/experiment")
    public String getEx(){
        return "severalForm";
    }


    @GetMapping("/several")
    public String getSev(@RequestParam(value = "prod_type") String prodType,
                         @RequestParam (value = "prod_name") String prodName,
                         @RequestParam(value = "prod_min_price") float min,
                         @RequestParam(value = "prod_max_price") float max,
                         @RequestParam(value = "several_criteria_button") String prodButton, Model model){
        model.addAttribute("name", prodName);
        model.addAttribute("button", prodButton);
        List<Product> products = productService.getBySeveralCriteria(prodType, prodName, min, max);
        model.addAttribute("products", products);
        return "page";
    }

//    @GetMapping("/AbsAllProd")
//    public String getAllProd(Pageable pageable,Optional<Integer> page, Model model){
//        Page<Product> products = productService.getAll(page);
//        model.addAttribute("products", products);
//        model.addAttribute("pageable", pageable);
//        return "p";
//    }

//    @GetMapping("/pagination")
//    public String listProducts(Model model,
//                               @RequestParam (value = "size", required = false, defaultValue = "5") Integer size,
//                               @RequestParam (value = "page", required = false, defaultValue = "6") Integer page){
//        Page<Product> pageProducts = productRepository.findAll(PageRequest.of(page, size));
//
//        model.addAttribute("products", pageProducts);
//        model.addAttribute("numbers", IntStream.range(0, pageProducts.getTotalPages()).toArray());
//
//        return "p";
//    }

}
