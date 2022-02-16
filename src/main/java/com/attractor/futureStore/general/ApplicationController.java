package com.attractor.futureStore.general;

import com.attractor.futureStore.joinTable.ProdAndUser;
import com.attractor.futureStore.joinTable.ProdAndUserRepository;
import com.attractor.futureStore.joinTable.ProdAndUserService;
import com.attractor.futureStore.product.Product;
import com.attractor.futureStore.product.ProductRepository;
import com.attractor.futureStore.product.ProductService;
import com.attractor.futureStore.user.User;
import com.attractor.futureStore.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.nio.file.FileAlreadyExistsException;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ApplicationController {
    private final UserService userService;
    private final ProdAndUserService prodAndUserService;
    private final ProductService productService;
    private final ProdAndUserRepository prodAndUserRepository;
    private final ProductRepository productRepository;

    String userName;
    Integer userId1;


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
    public String getIndex(Model model){
        if (userId1 != null){
            model.addAttribute("hi", userId1);
        }else {
            model.addAttribute("hi", "NeedRegistration");
        }
        return "indexx";
    }

    @GetMapping("/myCart/NeedRegistration")
    public String getCartRestriction(){
        return "redirect:/register";
    };



    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    };



    ////////////////////////////////////////////

//    @RequestMapping("/users/{user_id}")
//    public String getUserInfo(@PathVariable("user_id") Long userId, Principal principal){
//        // test if userId is current principal or principal is an ADMIN
//        ....
//    }

    @GetMapping("/myCart/{userId}")
    public String getProductsInCart(@PathVariable Integer userId, Model model){
        List<ProdAndUser> prodAndUsers = prodAndUserRepository.getProdAndUsersByUserId(userId);
        List<Product> pAndU = prodAndUsers.stream().map(x->x.getProduct()).collect(Collectors.toList());
        model.addAttribute("productsInCart", pAndU);
        return "cart";
    }



    @GetMapping("/register")
    public String getRegistrationPage(){
        return "register";
    }

    @GetMapping("/experiment")
    public String getEx(){
        return "severalForm";
    }


    @GetMapping("/qwerty")
    public String getQ(){


        return "severalForm";
    }


    @GetMapping("/registerUser")
    public String registerNewUser(@RequestParam(value = "username") String username,
                                  @RequestParam(value = "email") String email,
                                  @RequestParam(value = "password") String password,
                                  Model model, HttpSession session) throws FileAlreadyExistsException {
        User user = userService.getByUsername(username);

        if (user == null){
            BCryptPasswordEncoder b = new BCryptPasswordEncoder();
            String encoded = b.encode(password);

            User newUser = new User(username, email, encoded, true, "USER");
            userService.saveNewUser(newUser);
            User currentUser = userService.getByUsername(username);
            userName = currentUser.getUsername();
            userId1 = currentUser.getId();

            session.setAttribute(userName, userId1);
            session.setAttribute("userId", userId1);
        }else {
            throw new FileAlreadyExistsException("User already exist");
        }
        return "redirect:/";
    }




    @GetMapping("/putProdInCart")
    public String getProdValue(@RequestParam(value = "prodValue") Integer prodId, HttpSession session, Model model, HttpServletRequest request){
        Integer userId = (Integer) session.getAttribute(userName);
        if (userId==null){
            return "redirect:/register";
        }

        Product chosenProduct = productService.getById(prodId);
        User currentUsr = userService.getUserById(userId);

        ProdAndUser prodAndUser = new ProdAndUser(chosenProduct, currentUsr);
        prodAndUserService.saveProdAndUser(prodAndUser);

        return "redirect:/";
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


    @GetMapping("/welcomePage")
    public String hello(){
        return "welcome";
    }

}
