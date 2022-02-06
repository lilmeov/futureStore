package com.attractor.futureStore.user;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService userService;

    @GetMapping("/findById/{id}")
    public User getById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/saveUser")
    public User saveNewUser(@RequestBody @Valid User user){
        return userService.saveNewUser(user);
    }

    @GetMapping("/findAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @GetMapping("/findByUsername/{username}")
    public User getByUsername(@PathVariable String username){
        return userService.getByUsername(username);
    }

}
