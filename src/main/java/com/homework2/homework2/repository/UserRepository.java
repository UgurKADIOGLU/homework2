package com.homework2.homework2.repository;

import com.homework2.homework2.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String name);
    //@Query("delete from User u where u.userName=:name and u.telephoneNumber=:telefone")
    @Transactional
    void deleteUserByUserNameAndTelephoneNumber(String name,String telefone);
}
