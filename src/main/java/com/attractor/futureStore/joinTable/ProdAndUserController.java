package com.attractor.futureStore.joinTable;

import com.attractor.futureStore.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/Cart")
public class ProdAndUserController {
    private final ProdAndUserService prodAndUserService;
    private final ProdAndUserRepository prodAndUserRepository;




    //Find products that user put in cart by User's Id
    @ResponseBody
    @GetMapping("/findByUsrId/{id}")
    public List<ProdAndUser> getByUserId(@PathVariable Integer id){
        return prodAndUserRepository.getProdAndUsersByUserId(id);
    }


    @ResponseBody
    @GetMapping("/allThem")
    public List<ProdAndUser> getAllProdAndUser(){
        return prodAndUserService.getAllProdAndUser();
    }

    @ResponseBody
    @PostMapping("/saveProdAndUser")
    public ProdAndUser getAllProdAndUser(@RequestBody ProdAndUser prodAndUser){
        return prodAndUserService.saveProdAndUser(prodAndUser);
    }
}
