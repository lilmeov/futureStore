package com.attractor.futureStore.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(Integer id){
        return userRepository.getUserById(id);
    }

    public User saveNewUser(User user){
        return userRepository.save(user);
    }

    public User getByUsername(String username){
        return userRepository.getUserByUsername(username);
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
}
