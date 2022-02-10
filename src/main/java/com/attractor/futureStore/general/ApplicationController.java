package com.attractor.futureStore.general;

import com.attractor.futureStore.joinTable.ProdAndUser;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ApplicationController {
    private final UserService userService;
    private final ProdAndUserService prodAndUserService;
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

//    @GetMapping("/loginto")
//    public String getLoginPage(@RequestParam(value = "username") String username,
//                               @RequestParam(value = "password") String password) throws NoSuchObjectException {
//        User user = userService.getByUsername(username);
//
//        if (user == null){
//            return "redirect:/register";
//        }
//
//        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
//        String coded = b.encode(password);
//
//        if (user.getPassword() == coded){
//            return "redirect:/";
//        }
//        return "redirect:/";
//    }

//    @GetMapping("/login")
//    public String getLoginPage(){
//        return "login";
//    };


    @GetMapping("/register")
    public String getRegistrationPage(){
        return "register";
    }

    @GetMapping("/experiment")
    public String getEx(){
        return "severalForm";
    }


    String userName;

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

            int currentUserId = currentUser.getId();
            session.setAttribute(userName, currentUserId);
        }else {
            throw new FileAlreadyExistsException("User already exist");
        }
        return "redirect:/";
    }



    List<Product> myProducts;

    @GetMapping("/putProdInCart")
    public String getProdValue(@RequestParam(value = "prodValue") Integer prodId, HttpSession session){
        Integer userId = (Integer) session.getAttribute(userName);
        if (userId==null){
            return "redirect:/register";
        }

        Product chosenProduct = productService.getById(prodId);
//        User currentUser = userService.getUserById(userId);

        ProdAndUser prodAndUser = new ProdAndUser(prodId, userId);
        prodAndUserService.saveProdAndUser(prodAndUser);


//        Product chsnProduct = productService.getById(prodId);

//        List<Product> products = (List<Product>) session.getAttribute("q");
//
//        System.out.println(products);


//        User currentUser = userService.getUserById(userId);
//        String userName1 = currentUser.getUsername();
//
//
//
//        myProducts = new ArrayList<>();
//        myProducts.add(chosenProduct);
//
//
//
////        System.out.println(myProducts);
//        System.out.println(myProducts);

//        session.setAttribute(userName1, myProducts);
//
//        System.out.println(session.getAttribute(userName));

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

//    @GetMapping("/login")
//    public String showLoginPage(){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null || authentication instanceof AnonymousAuthenticationToken){
//            return "login";
//        }
//        return "redirect:/";
//    }

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
