package com.attractor.futureStore.security;

import com.attractor.futureStore.user.User;
import com.attractor.futureStore.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class UserPrincipalDetailsService implements UserDetailsService {
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.getUserByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }
}
