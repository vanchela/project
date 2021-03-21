package com.example.project.service.impl;

import com.example.project.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AnimalUserService implements UserDetailsService {
    private final UserRepository userRepository;

    public AnimalUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.project.model.entities.User userEntity = userRepository.
                findByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException("User with name " + username + " was not found!"));

        return mapToUserDetails(userEntity);
    }

    private UserDetails mapToUserDetails(com.example.project.model.entities.User userEntity) {
        List<GrantedAuthority> authorities =
                userEntity.getRoles()
                .stream()
                .map(r-> new SimpleGrantedAuthority("ROLE_"+ r.getRole()))
                .collect(Collectors.toList());

        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                authorities
        );
    }
}
