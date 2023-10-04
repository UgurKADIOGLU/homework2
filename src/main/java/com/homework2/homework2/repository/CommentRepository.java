package com.homework2.homework2.repository;

import com.homework2.homework2.entities.Comment;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
       @Transactional
       List<Comment> findAllByUser_Id(Long id);
       @Transactional
       List<Comment> findAllByProduct_Id(Long id);
}
