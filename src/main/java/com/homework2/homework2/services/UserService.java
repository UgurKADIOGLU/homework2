package com.homework2.homework2.services;

import com.homework2.homework2.converter.UserMapper;
import com.homework2.homework2.dto.UserPutRequestDto;
import com.homework2.homework2.dto.UserPutResponseDto;
import com.homework2.homework2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.homework2.homework2.entities.User;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User findByName(String name) {
        return userRepository.findByUserName(name);
    }

    public String deleteByNameAndTelefone(String name, String telefone) {
        User user=userRepository.findByUserName(name);
        if(user.getUserName()==name && user.getTelephoneNumber()==telefone){
        userRepository.deleteUserByUserNameAndTelephoneNumber(name, telefone);
        return "Silme işlemi başarılı";
        }else {
            return name+" kullanıcı adı ile "+telefone+" telefonu uyuşmamaktadır";
        }

    }

    public UserPutResponseDto put(UserPutRequestDto userPutRequestDto) {
        User user= UserMapper.INSTANCE.map(userPutRequestDto);
        userRepository.save(user);
        return UserMapper.INSTANCE.map(user);
    }
}
