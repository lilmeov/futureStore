package com.attractor.futureStore.joinTable;

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


    @ResponseBody
    @GetMapping("/findBothByUserId/{id}")
    public ProdAndUser getBothById(@PathVariable Integer id){
        return (ProdAndUser) prodAndUserRepository.getProdAndUsersByUserId(id);
    }

//    @ResponseBody
//    @GetMapping("/findBothByUserId/{id}")
//    public ProdAndUser getBothById(@PathVariable Integer id){
//        return prodAndUserService.getBothWithUserId(id);
//    }

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
