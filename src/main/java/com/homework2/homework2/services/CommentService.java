package com.homework2.homework2.services;

import com.homework2.homework2.converter.CommentMapper;
import com.homework2.homework2.dto.CommentSaveRequest;
import com.homework2.homework2.dto.CommentSaveResponse;
import com.homework2.homework2.entities.Comment;
import com.homework2.homework2.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public List<Comment> findAllByUser_Id(Long id) {
        return commentRepository.findAllByUser_Id(id);
    }

    public List<Comment> findAllByProduct_Id(Long id) {
        return commentRepository.findAllByProduct_Id(id);
    }

    public CommentSaveResponse save(CommentSaveRequest commentSaveRequest) {
        Comment comment=CommentMapper.INSTANCE.map(commentSaveRequest);
        commentRepository.save(comment);
        return CommentMapper.INSTANCE.map(comment);
    }

    public void delete(Long id) {
        commentRepository.deleteById(id);
    }
}
