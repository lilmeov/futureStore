package com.attractor.futureStore.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
