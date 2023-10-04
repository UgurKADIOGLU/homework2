package com.homework2.homework2.repository;

import com.homework2.homework2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
