package com.homework2.homework2.contoller;

import com.homework2.homework2.dto.UserPutRequestDto;
import com.homework2.homework2.dto.UserPutResponseDto;
import com.homework2.homework2.entities.User;
import com.homework2.homework2.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public User save(User user) {
        return userService.save(user);
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public User findById(Long id) {
        return userService.findById(id);
    }

    @GetMapping("name/{name}")
    public User findByName(String name) {
        return userService.findByName(name);
    }

    @DeleteMapping("delete/{name}/{telefone}")
    public void delete(@PathVariable String name, String telefone) {
        userService.deleteByNameAndTelefone(name, telefone);
    }

    @PutMapping
    public UserPutResponseDto put(UserPutRequestDto userPutRequestDto) {
       return userService.put(userPutRequestDto);
    }

}
