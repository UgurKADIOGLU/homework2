package com.homework2.homework2.services;

import com.homework2.homework2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.homework2.homework2.entities.User;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User save(User user) {
        return userRepository.save(user);
    }
}
