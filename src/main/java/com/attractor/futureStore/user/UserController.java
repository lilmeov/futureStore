package com.attractor.futureStore.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/findById/{id}")
    public User getById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/saveUser")
    public User saveNewUser(@RequestBody User user){
        return userService.saveNewUser(user);
    }
}
