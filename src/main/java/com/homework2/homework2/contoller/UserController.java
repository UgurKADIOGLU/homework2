package com.homework2.homework2.contoller;

import com.homework2.homework2.entities.User;
import com.homework2.homework2.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @PostMapping
    public User save(User user){
        return userService.save(user);
    }
}
